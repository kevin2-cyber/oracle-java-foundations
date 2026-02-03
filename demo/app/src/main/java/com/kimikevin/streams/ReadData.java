package com.kimikevin.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadData {
    /**
     * Reads file into byte array then prints it
     */
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/file.txt");
        byte[] byteArray = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(byteArray);
        System.out.println(Arrays.toString(byteArray));
        fis.close();
    }
}
