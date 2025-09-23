package com.kimikevin.reflection;

import java.util.Scanner;

/**
 * An Implementation of StringBuilder class
 */
public class Main {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string.replaceAll("\\d", ""));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);

        Class<?> stringClass = String.class;
        Class<?> intClass = int.class;
        Class<?> voidClass = void.class;

        System.out.println(stringClass.getName());
        System.out.println(intClass.getName());
        System.out.println(voidClass.getName());

        Class<?> instanceClass = "abc".getClass();
        System.out.println(instanceClass.getName());
    }
}
