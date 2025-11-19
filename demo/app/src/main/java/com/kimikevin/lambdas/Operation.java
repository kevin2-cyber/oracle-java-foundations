package com.kimikevin.lambdas;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Operation {
    public static IntBinaryOperator binaryOperator = Math::max;

    public static IntPredicate isDivisibleBy3And5 = n -> n % 3 == 0 && n % 5 == 0;

    public static BiFunction<Integer, Integer, Integer> max = Integer::max;
}