package com.kimikevin.composing;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // composing functions
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;

        System.out.println("result: " + adder.compose(multiplier).apply(5));
        System.out.println("result: " + adder.andThen(multiplier).apply(5));
    }
}
