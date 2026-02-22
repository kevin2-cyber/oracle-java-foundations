package com.kimikevin.streams;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class WriterMain {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try(InputStream input = Files.newInputStream(Paths.get(".env"))) {
            properties.load(input);
        } catch (Exception e) {
            System.err.println("Error loading .env file: " + e.getMessage());
        }

        String fileOne = properties.getProperty("BUSINESS_CARD_1");
        String fileTwo = properties.getProperty("BUSINESS_CARD_2");
        // Writes contact details to files; handles exceptions
        try (CharArrayWriter contactWriter = new CharArrayWriter(); FileWriter bc1 = new FileWriter(fileOne, true);
             FileWriter bc2 = new FileWriter(fileTwo, true)) {

            contactWriter.write("Phone: 111-222-333; Address: Java Avenue, 7");
            contactWriter.writeTo(bc1);
            contactWriter.writeTo(bc2);

            char[] array = contactWriter.toCharArray();
        } catch (IOException e) {
            System.err.printf("An error occurred: %s", e.getMessage());
        } finally {
            System.out.println("Done!");
        }
    }
}
