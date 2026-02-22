package com.kimikevin.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class StreamMain {
    public static void main(String[] args) {

        Properties properties = new Properties();
        try(InputStream input = Files.newInputStream(Paths.get(".env"))) {
            properties.load(input);
        } catch (Exception e) {
            System.err.println("Error loading .env file: " + e.getMessage());
        }

        String filePath = properties.getProperty("FILE_PATH");
        // Reads and prints file content; handles exceptions
        try {
            FileInputStream fis = new FileInputStream(filePath);
            byte[] arr = new byte[3];
            fis.read(arr);
            for (byte b : arr) {
                System.out.println((char) b);
            }
            fis.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
