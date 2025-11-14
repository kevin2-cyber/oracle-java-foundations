package com.kimikevin;

import java.util.Scanner;

public class SumArrayGreaterThan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int limit = scanner.nextInt();

        int sum = sumGreaterThan(array, limit);

        System.out.println("Sum of elements greater than " + limit + " is: " + sum);
    }

    /**
     * Returns the sum of all elements in the array that are strictly greater than the given limit.
     *
     * @param array the array of integers
     * @param limit the comparison value
     * @return sum of elements > limit
     */
    public static int sumGreaterThan(int[] array, int limit) {
        int sum = 0;
        for (int value : array) {
            if (value > limit) {
                sum += value;
            }
        }
        return sum;
    }
}
