package com.kimikevin.lambdas;

import java.util.Objects;
import java.util.function.Function;

public class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> a != b && b != c && a != c;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }

    @FunctionalInterface
    interface StringOperator {
        String apply(String value);

        default boolean checkNotNull(String value) {
            return !Objects.isNull(value);
        }
    }
}
