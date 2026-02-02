package com.kimikevin.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOrderCharacterStream {
    /**
     * Reads lines; reverses each; prints reversed lines
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.lines().map(line -> new StringBuilder(line).reverse().toString()).forEach(System.out::println);
        reader.close();
    }
}
