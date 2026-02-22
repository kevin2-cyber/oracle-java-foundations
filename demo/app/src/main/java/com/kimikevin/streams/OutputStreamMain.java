package com.kimikevin.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

public class OutputStreamMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        try(InputStream input = Files.newInputStream(Paths.get(".env"))) {
            properties.load(input);
        } catch (Exception e) {
            System.err.println("Error loading .env file: " + e.getMessage());
        }

        String sampleFile = properties.getProperty("SAMPLE_FILE_PATH");

        byte[] data = new byte[]{'s', 't', 'r', 'e', 'a', 'm',};
        OutputStream outputStream = new FileOutputStream(sampleFile, false);
        outputStream.write(data);
        outputStream.close();

        String str = "stream";
        byte[] strAsBytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(strAsBytes));

//        int[] message = new int[] {114,101,97,100,32,97,98,111,117,116,32,65,83,67,73,73};
//
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        for(int code: message) {
//            outputStream.write(code);
//        }
//
//        System.out.println(outputStream);
    }
}
