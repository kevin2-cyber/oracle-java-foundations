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

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);

        // The .class Syntax
        Class<?> stringClass = String.class;
        Class<?> intClass = int.class;
        Class<?> voidClass = void.class;

        System.out.println(stringClass.getName());
        System.out.println(intClass.getName());
        System.out.println(voidClass.getName());

        // Retrieve Class from an object instance
        Class<?> instanceClass = "abc".getClass();
        System.out.println(instanceClass.getName());

        // Retrieve Class with a given name
        Class<?> forName = Class.forName("java.lang.String");

        Class<?> floatArrayClass = Class.forName("[F");
        Class<?> objectArrayClass = Class.forName("[[Ljava.lang.Object;");
        Class<?> scannerArrayClass = Class.forName("[Ljava.util.Scanner;");

        System.out.println(forName.getName());
        System.out.println(objectArrayClass.getName());
        System.out.println(scannerArrayClass.getName());
        System.out.println(floatArrayClass.getName());

        // Methods that return classes

        // Returns the super class for the given class
        String.class.getSuperclass();

        // Returns all the public classes, interfaces, and enums that are members of the class
        String.class.getClasses();

        // Returns all the classes, interfaces, and enums that are explicitly declared in this class.
        String.class.getDeclaredClasses();
        Main main = new Main();
        String objectString = main.getObjectClassName(new Object());

        System.out.println(objectString);
    }

    public String getObjectClassName(Object object) {
        // Add implementation here
        return object.getClass().getName();
    }
}
