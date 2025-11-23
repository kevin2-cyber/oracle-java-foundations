package com.kimikevin.strings;

import java.util.Arrays;

public class ProcessingStrings {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E','F'};
        String stringFromChars = String.valueOf(chars);

        char[] charsFromString = stringFromChars.toCharArray();

        String theSameString = new String(charsFromString);

        System.out.println(Arrays.toString(chars));
        System.out.println(stringFromChars);
        System.out.println(Arrays.toString(charsFromString));
        System.out.println(theSameString);

        String text = "Hello";
        String[] parts = text.split(""); // {"H", "e", "l", "l", "o"}
        System.out.println(Arrays.toString(parts));
    }
}
