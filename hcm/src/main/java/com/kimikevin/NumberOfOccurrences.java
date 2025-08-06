package com.kimikevin;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int occurrence = count(array, target);
        System.out.println(occurrence);
    }

    public static int count(int[] array, int t) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int count = 0;
        for (int j : array) {
            if (j == t) {
                count++;
            }
        }
        return count;
    }
}
