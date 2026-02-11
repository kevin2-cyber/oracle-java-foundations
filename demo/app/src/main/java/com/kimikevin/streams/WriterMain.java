package com.kimikevin.streams;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {
    public static void main(String[] args) {

        String fileOne = "/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/business_card_1.txt";
        String fileTwo = "/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/business_card_2.txt";
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
