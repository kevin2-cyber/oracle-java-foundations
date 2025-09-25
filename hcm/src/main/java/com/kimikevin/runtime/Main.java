package com.kimikevin.runtime;

public class Main {
    public static void main(String[] args){
        Object obj = " ";

        if (obj instanceof String str && str.length() > 0) {
            if (str.isBlank()) {
                System.out.println("The variable is empty or contains only a whitespace");
            }
        }

        Class<?> clazz = "".getClass();
        System.out.println(clazz);
    }
}
