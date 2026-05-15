import os
import json
import subprocess
import warnings
# Fix 1: Suppress the annoying LibreSSL warning entirely so it doesn't block processing
from urllib3.exceptions import NotOpenSSLWarning
warnings.filterwarnings("ignore", category=NotOpenSSLWarning)

# Configuration
TOKEN = os.getenv("GITHUB_TOKEN")
OWNER = "kevin2-cyber"
REPO = "El-Apunte"
BRANCH = "master"

ALLOWED_EXTENSIONS = {'.java', '.proto', '.xml', '.gradle'}
EXCLUDED_PATHS = {'build/', '.gradle/', '.idea/', 'app/build/', 'build/generated/', 'app/build/generated/source/proto/'}
EXCLUDED_FILES = {'gradlew', 'gradlew.bat', 'local.properties', 'google-services.json'}

# Require token from environment for authenticated API requests
headers = {}
if not TOKEN:
    print("\n[ERROR] GITHUB_TOKEN environment variable is not set. Export it and retry.")
    print("Example: export GITHUB_TOKEN=ghp_...")
    exit(1)

headers["Authorization"] = f"Bearer {TOKEN}"

def fetch_url(url):
    command = ["curl", "-fsSL", "-w", "\n%{http_code}", url]
    for header_name, header_value in headers.items():
        command.extend(["-H", f"{header_name}: {header_value}"])

    result = subprocess.run(command, capture_output=True, text=True)
    if result.returncode != 0:
        print(f"\n[ERROR] Failed to fetch '{url}'.")
        print(result.stderr.strip())
        exit(1)

    body, status_code = result.stdout.rsplit("\n", 1)
    return int(status_code), body

tree_url = f"https://api.github.com/repos/{OWNER}/{REPO}/git/trees/{BRANCH}?recursive=1"

print(f"Analyzing /{OWNER}/{REPO} file structure...")
status_code, response_body = fetch_url(tree_url)

# Fix 3: Fail gracefully with helpful debug info instead of crashing on HTML content
if status_code != 200:
    print(f"\n[ERROR] GitHub API Request failed with Status Code: {status_code}")
    if status_code == 401:
        print("-> Hint: Your GITHUB_TOKEN is invalid, expired, or missing.")
    elif status_code == 403:
        print("-> Hint: Rate limit exceeded or forbidden. Make sure your Token has read access to public repos.")
    elif status_code == 404:
        print(f"-> Hint: Repository or branch '{BRANCH}' not found. Verify the name spelling.")
    print(f"Raw Response Content snippet: {response_body[:200]}")
    exit()

try:
    tree_data = json.loads(response_body).get("tree", [])
except Exception as e:
    print(f"\n[ERROR] Failed to parse JSON response. The server returned something else.")
    print(f"Raw body data: {response_body[:500]}")
    exit()

output_filename = f"{REPO}_grpc_jetpack_codebase.txt"
with open(output_filename, "w", encoding="utf-8") as outfile:
    outfile.write(f"# ANDROID SYSTEM CONTEXT: {OWNER}/{REPO}\n\n")
    
    outfile.write("## Module and Package Architecture Map\n```text\n")
    for item in tree_data:
        path = item['path']
        if not any(path.startswith(p) for p in EXCLUDED_PATHS):
            outfile.write(f"{path}\n")
    outfile.write("```\n\n## Core File Dump\n\n")
    
    for item in tree_data:
        if item["type"] == "blob":
            file_path = item["path"]
            _, ext = os.path.splitext(file_path)
            
            is_excluded_path = any(file_path.startswith(p) for p in EXCLUDED_PATHS)
            is_excluded_file = os.path.basename(file_path) in EXCLUDED_FILES
            
            if ext in ALLOWED_EXTENSIONS and not is_excluded_path and not is_excluded_file:
                print(f"Harvesting context: {file_path}")
                raw_url = f"https://raw.githubusercontent.com/{OWNER}/{REPO}/{BRANCH}/{file_path}"
                file_status, file_body = fetch_url(raw_url)
                
                if file_status == 200:
                    outfile.write(f"### FILE: {file_path}\n")
                    outfile.write(f"```{ext.strip('.')}\n")
                    outfile.write(file_body)
                    outfile.write("\n```\n\n")

print(f"\nSuccess! Final context payload compiled to '{output_filename}'.")
