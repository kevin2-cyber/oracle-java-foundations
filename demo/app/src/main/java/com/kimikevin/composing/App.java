package com.kimikevin.composing;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> next = n -> n + 1;
        Function<Integer, Integer> previous = n -> n - 1;
        Function<Integer, Integer> square = n -> n * n;
        Function<Integer, Integer> mult3 = n -> n * 3;

        Function<Integer, Integer> bigFunction =
                next.compose(next.compose(square).andThen(previous)).andThen(mult3);

        System.out.println(bigFunction.apply(2));
    }
}
