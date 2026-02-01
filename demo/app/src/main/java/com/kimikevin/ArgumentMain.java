package com.kimikevin;

import java.util.Arrays;

public class ArgumentMain {
    public static void main(String[] args) {
//        // checking the index of an argument
//        System.out.println(Arrays.asList(args).indexOf("test"));
//        // formatting arguments
//        formatArgs(args);
        calculate(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }

    private static void formatArgs(String[] args) {
        for (int i = 0; i < args.length; i +=2) {
            System.out.println(args[i] + "=" + args[i + 1]);
        }
    }

    // Performs arithmetic based on an operator argument
    private static void calculate(String operator, int a, int b) {
        switch (operator) {
            case "+" -> {
                int sum;
                sum = a + b;
                System.out.println(sum);
            }
            case "-" -> {
                int diff;
                diff = a - b;
                System.out.println(diff);
            }
            case "*" -> {
                int product;
                product = a * b;
                System.out.println(product);
            }
            default -> System.out.println("Unknown operator");
        }
    }

}
