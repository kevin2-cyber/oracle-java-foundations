package com.kimikevin.abstractexample;

public class Main {
    public static void main(String[] args) {
//        Pet cat = new Cat("Kitty", 5);
//        cat.say();
//        Pet dog = new Dog("Buddy", 3);
//        dog.say();
//        System.out.println(args[0]);
//        whatever();
//        loop();
//        int number1 = 38;
//        int number2 = 54;
//
//        number1 = number1 << 2;
//        number2 = number2 >> 1;
//
//        int result = number2 ^ number1;
//        System.out.println(result);

        int fibonacciPrevious = 1;
        int fibonacciCurrent = 1;
        int fibonacciSum = fibonacciPrevious + fibonacciCurrent;

        while (true) {
            int temp = fibonacciPrevious + fibonacciCurrent;
            fibonacciPrevious = fibonacciCurrent;
            fibonacciCurrent = temp;
            fibonacciSum += fibonacciCurrent;
        }
    }

    // for debugging with an if-statement
    public static void whatever() {
        String greeting = "Hello World";
        if (greeting.contains("e")) {
            greeting += "!";
            System.out.println(greeting);
        }
        System.out.println("Shutting down");
    }

    // for debugging with a loop
    public static void loop() {
        char rangeStart = 'C';
        char rangeEnd = 'Y';
        char findLetter = 'Q';
        for (char letter = rangeStart; letter <= rangeEnd; letter++) {
            if (letter == findLetter) {
                System.out.printf("Character %s is within range %s-%s", findLetter, rangeStart, rangeEnd);
                return;
            }
        }
        System.out.printf("Character %s is not within range %s-%s", findLetter, rangeStart, rangeEnd);
    }
}
