package com.kimikevin.optional;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptionalValueProviderMain {
    public static void main(String[] args) {
        OptionalValueProvider provider = new OptionalValueProvider();
//        provider.getValues().stream()
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .reduce(Integer::sum)
//                .get();
        int sum = provider.getValues()
                .stream()
                .mapToInt(opt -> opt.orElse(0)).sum();

        System.out.println(sum);
    }
}

class OptionalValueProvider {
    private List<Optional<Integer>> opts;

    public List<Optional<Integer>> getValues() {
        if (opts != null) {
            return opts;
        }

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        opts = IntStream
                .rangeClosed(1,number)
                .mapToObj(n -> {
                    String val = scanner.next();
                    return "null".equals(val) ?
                            Optional.<Integer>empty():
                            Optional.of(Integer.valueOf(val));
                })
                .collect(Collectors.toList());
        return opts;
    }
}
