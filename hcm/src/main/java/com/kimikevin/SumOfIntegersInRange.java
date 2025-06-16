package com.kimikevin;

import java.util.Scanner;

public class SumOfIntegersInRange {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        // write your code here
        return (((long) to * (to + 1) / 2) - ((long) (from - 1) * from / 2)) - to;
    }
}
