package com.kimikevin;

public class Task {
    public static void main(String[] args) {

        String haystack = "supercalifragilisticexpialidocious";

        int haystackLength = haystack.length();

        String pattern = "cali";

        int patternLength = pattern.length();

        boolean next;

        for (int i = 0; i < haystackLength - patternLength + 1; i++) {
            next = false;

            for (int j = 0; j < patternLength; j++) {
                if (haystack.charAt(i + j) != pattern.charAt(j)) {
                    next = true;
                    break;
                }
            }

            if (!next) {
                System.out.println("Pattern " + pattern + " found in " + haystack);
                break;
            }
        }
    }
}
