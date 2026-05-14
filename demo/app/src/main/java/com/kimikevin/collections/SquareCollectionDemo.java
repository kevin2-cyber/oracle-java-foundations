package com.kimikevin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SquareCollectionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collection<Integer> result = SquareCollectionUtils.pow2(numbers);

        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}

class SquareCollectionUtils {
    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        return numbers.stream().map(n -> n * n).toList();
    }
}
