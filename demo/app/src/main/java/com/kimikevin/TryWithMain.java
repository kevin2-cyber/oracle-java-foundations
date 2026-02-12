package com.kimikevin;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithMain {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    static void readFile() throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("/Users/thomas/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/file.txt");
            throw new RuntimeException("Something went wrong");
        } finally {
           try {
               assert reader != null;
               reader.close();
           } catch (Exception e) {
               System.err.println("Failed to close reader: " + e.getMessage());
           }
        }
    }
}
