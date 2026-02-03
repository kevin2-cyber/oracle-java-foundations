package com.kimikevin.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamMain {
    public static void main(String[] args) {
        // Reads and prints file content; handles exceptions
        try {
            FileInputStream fis = new FileInputStream("/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/file.txt");
            byte[] arr = new byte[3];
            fis.read(arr);
            for (byte b : arr) {
                System.out.println((char) b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
