package com.kimikevin.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> absent = Optional.empty();
        Optional<String> present = Optional.of("Hello");

        System.out.println(absent.isPresent());
        System.out.println(present.isPresent());

        String message = getRandomMessage();
        Optional<String> optionalMessage = Optional.ofNullable(message);
        System.out.println(optionalMessage.isPresent());

        Optional<String> optName = Optional.of("John");
        String name = optName.get();
        System.out.println(name);

//        Optional<String> optionalName = Optional.ofNullable(null);
//        String nullName = optionalName.get();
//        System.out.println(nullName);

        String nullableName = null;
        String name2 = Optional.ofNullable(nullableName).orElse("unknown");
        System.out.println(name2);
    }

    public static String getRandomMessage() {
        return "Hello World";
    }
}
