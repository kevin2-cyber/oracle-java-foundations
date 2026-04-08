package com.kimikevin;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class TryWithMain {
    public static void main(String[] args) {

        Properties properties = new Properties();
        try(InputStream input = Files.newInputStream(Paths.get(".env"))) {
            properties.load(input);
        } catch (Exception e) {
            System.err.println("Error loading .env file: " + e.getMessage());
        }

        String filePath = properties.getProperty("READ_FILE_PATH");

        try {
            readFile(filePath);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        String language;
        try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in))) {
            language = buffReader.readLine();
            System.out.println("I'm learning " + language);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    static void readFile(String filePath) throws IOException {
        try(Reader reader = new FileReader(filePath)) {
           int data = reader.read();
              while(data != -1) {
                System.out.print((char) data);
                data = reader.read();
              }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
