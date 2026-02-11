package com.kimikevin.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamMain {
    public static void main(String[] args) throws IOException {
        String sampleFile = "/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/sample.txt";

        byte[] data = new byte[]{'s', 't', 'r', 'e', 'a', 'm',};
        OutputStream outputStream = new FileOutputStream(sampleFile, false);
        outputStream.write(data);
        outputStream.close();
    }
}
