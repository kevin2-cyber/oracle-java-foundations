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
        try(Reader reader = new FileReader("/Users/thomas/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/file.txt")) {
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
