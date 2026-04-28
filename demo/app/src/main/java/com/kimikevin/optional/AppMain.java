package com.kimikevin.optional;

import java.util.Optional;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        provider.getValue().ifPresent(System.out::println);
    }
}

class ValueProvider {
    private Optional<String> inputOpt;

    public Optional<String> getValue() {
        if (inputOpt == null) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            inputOpt = "null".equals(input) ? Optional.empty() : Optional.of(input);
        }
        return inputOpt;
    }
}
