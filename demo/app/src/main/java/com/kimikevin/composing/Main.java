package com.kimikevin.composing;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        // composing functions
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;

        System.out.println("result: " + adder.compose(multiplier).apply(5));
        System.out.println("result: " + adder.andThen(multiplier).apply(5));
        System.out.println("----------------");

        // composing predicates
        IntPredicate isOdd = n -> n % 2 != 0;

        System.out.println(isOdd.test(10));
        System.out.println(isOdd.test(11));
        System.out.println("----------------");

        IntPredicate lessThan11 = n -> n < 11;

        System.out.println(lessThan11.test(10));
        System.out.println(lessThan11.test(11));
        System.out.println("----------------");

        IntPredicate isEven = isOdd.negate();
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));
        System.out.println("----------------");

        IntPredicate isOddOrLessThan11 = isOdd.or(lessThan11);
        System.out.println(isOddOrLessThan11.test(10));
        System.out.println(isOddOrLessThan11.test(11));
        System.out.println(isOddOrLessThan11.test(12));
        System.out.println(isOddOrLessThan11.test(13));
        System.out.println("----------------");

        IntPredicate isOddAndLessThan11 = isOdd.and(lessThan11);
        System.out.println(isOddAndLessThan11.test(8));
        System.out.println(isOddAndLessThan11.test(9));
        System.out.println(isOddAndLessThan11.test(10));
        System.out.println(isOddAndLessThan11.test(11));
    }
}
