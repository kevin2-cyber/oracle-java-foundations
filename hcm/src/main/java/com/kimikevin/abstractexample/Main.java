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

//        int fibonacciPrevious = 1;
//        int fibonacciCurrent = 1;
//        int fibonacciSum = fibonacciPrevious + fibonacciCurrent;
//
//        while (true) {
//            int temp = fibonacciPrevious + fibonacciCurrent;
//            fibonacciPrevious = fibonacciCurrent;
//            fibonacciCurrent = temp;
//            fibonacciSum += fibonacciCurrent;
//        }

//        // primes and how to find them
//        int greatestPrimeInRange = 2;
//        for (int number = 2; number <= 1000; number++) {
//            if (isPrime(number) && number > greatestPrimeInRange) {
//                greatestPrimeInRange = number;
//            }
//        }
//        System.out.println(greatestPrimeInRange);

//        System.out.println(modifyString("my password is 12345"));
//        boolean result = isPrime(5977);
//        fibonacci();

        int condition1 = 175892;
        int condition2 = 98795;

        if ((condition1 & condition2) > 35925) {
            printXor(condition1 - condition2, condition1 | condition2);
        } else {
            printXor(condition1 ^ condition2, condition1 & condition2);
        }
    }

    // calls debugging
    public static void printXor(int condition1, int condition2) {
        System.out.println(condition1 ^ condition2);
    }

    // cycles and iterations
    public static void fibonacci() {
        int prev = 0;
        int current = 1;
        for (int i = 0; i <= 25; i++) {
            int swap = prev;
            prev = current;
            current += swap;
            System.out.println(current);
        }
    }

    // String modifier
    public static String modifyString(String initialString) {
        String modString = initialString;

        modString = modString.substring(0,2) + modString.substring(10); // 1
        if (modString.contains(" ")) { // 2
            modString += "ABC";
        }

        int space = modString.indexOf(" ");
        modString = modString.substring(space + 1) + modString.substring(0, space); // 3
        if (modString.contains("a")) { // 4
            modString += "1248";
        }

         modString = modString.replaceFirst("\\s", "\\$"); // 5
        if (modString.length() < 15) { // 6
            modString = new StringBuilder(modString).reverse().toString();
        }

        modString += "18B20"; // 7
        int one = modString.indexOf("1");
        int five = modString.indexOf("5");
        modString = modString.substring(one + 1) + modString.substring(0, five); // 8
        modString.substring(0, modString.length() -  4); // 9
        return modString;
    }

    // for checking if a number is prime
    public static boolean isPrime(int number) {
        for(int i = 2; i < number / 2; i++) {
            if (number % i != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
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
