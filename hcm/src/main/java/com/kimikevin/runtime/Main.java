package com.kimikevin.runtime;

public class Main {
    public static void main(String[] args) {
        Object obj = " ";

        if (obj instanceof String) {
            String str = (String) obj;

            if (str.isBlank()) {
                System.out.println("The variable is empty or contains only a whitespace");
            }
        }
    }
}
