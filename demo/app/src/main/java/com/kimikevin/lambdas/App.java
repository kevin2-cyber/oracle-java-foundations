package com.kimikevin.lambdas;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        ///1. Functions
        // String to Integer function
        Function<String, Integer> converter = Integer::parseInt;
        converter.apply("10000");

        // String to int function
        ToIntFunction<String> anotherConverter = Integer::parseInt;
        anotherConverter.applyAsInt("2000");

        // (Integer, Integer) to Integer function
        BiFunction<Integer, Integer, Integer> sumFunction = Integer::sum;
        sumFunction.apply(2,3);

        ///2. Operators
        // Long to Long multiplier
        UnaryOperator<Long> longMultiplier = val -> 100_000 * val;
        longMultiplier.apply(2L);

        // int to int operator
        IntUnaryOperator intMultiplier = val -> 100 * val;
        intMultiplier.applyAsInt(10);

        // (String, String) to String operator
        BinaryOperator<String> appender = (str1, str2) -> str1 + str2;
        appender.apply("str1", "str2");

        ///3. Predicates
        // Character to boolean predicate
        Predicate<Character> isDigit = new Predicate<Character>() {
            @Override
            public boolean test(Character character) {
                return Character.isDigit(character);
            }
        };
        isDigit.test('h');

        IntPredicate isEven = val -> val % 2 == 0;
        isEven.test(10);

        ///4. Suppliers
        Supplier<String> stringSupplier = () -> "Hello World";
        stringSupplier.get();

        BooleanSupplier booleanSupplier = () -> true;
        booleanSupplier.getAsBoolean();

        IntSupplier intSupplier = () -> 33;
        intSupplier.getAsInt();

        ///5. Consumers
        // it prints a given string
        Consumer<String> printer = System.out::println;
        printer.accept("!!!");
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse
    ) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
