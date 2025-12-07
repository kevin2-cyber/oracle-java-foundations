package com.kimikevin.debugging;

public class Greeter {
    public static void main(String[] args) {
        greetUser("Alice");
    }

    private static void greetUser(String name) {
        String greeting = "Hello, " + name;
        System.out.println(greeting);
    }
}
