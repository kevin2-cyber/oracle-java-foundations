package com.kimikevin;

import java.util.Scanner;

public class IfElementExistInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int theNumber = scanner.nextInt();

        System.out.println(isElementPartOfArray(array, theNumber));
    }

    public static boolean isElementPartOfArray(int[] array, int element) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int j : array) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }
}
