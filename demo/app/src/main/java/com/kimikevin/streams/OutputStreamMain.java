package com.kimikevin.streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class OutputStreamMain {
    public static void main(String[] args) throws IOException {
//        String sampleFile = "/Users/thomas/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/sample.txt";
//
//        byte[] data = new byte[]{'s', 't', 'r', 'e', 'a', 'm',};
//        OutputStream outputStream = new FileOutputStream(sampleFile, false);
//        outputStream.write(data);
//        outputStream.close();
//
//        String str = "stream";
//        byte[] strAsBytes = str.getBytes(StandardCharsets.UTF_8);
//        System.out.println(Arrays.toString(strAsBytes));

        int[] message = new int[] {114,101,97,100,32,97,98,111,117,116,32,65,83,67,73,73};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for(int code: message) {
            outputStream.write(code);
        }

        System.out.println(outputStream);
    }
}
