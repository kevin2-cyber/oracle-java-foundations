package com.kimikevin.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // single line of lambda
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;

        // if it has only one argument "()" are optional
        Function<Integer, Integer> adder1 = x -> x + 1;

        // with type reference
        Function<Integer, Integer> mult2 = (Integer x) -> x * 2;

        // with multiple statements
        Function<Integer, Integer> adder5 = (x) -> {
            x += 2;
            x += 3;
            return x;
        };

        boolean result4Div2 = isDivisible.apply(4,2);
        boolean result3Div5 = isDivisible.apply(3,5);

        System.out.println(result4Div2);
        System.out.println(result3Div5);

        // returns length of the string
        Function<String, Integer> f = s -> s.length();
        printResultOfLambda(f);

        // passing without a reference
        printResultOfLambda(s -> s.length());

        // prints the number of digits: 4
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });

        // closures
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        int constant = 100;
        Function<Integer, Integer> adder100 = x -> x + constant;

        System.out.println(adder100.apply(200));
        System.out.println(adder100.apply(300));

        System.out.println(Operation.binaryOperator.applyAsInt(2,3));
    }

    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY NEW YEAR 3000!"));
    }
}
