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
    }

    public static String getRandomMessage() {
        return "Hello World";
    }
}
