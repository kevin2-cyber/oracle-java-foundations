package com.kimikevin;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMaxOfAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }


        System.out.println(findFirstIndexOfMax(array));
    }

    public static int findFirstIndexOfMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle empty or null array case
        }

        int maxIndex = 0; // Initialize with the index of the first element
        int maxValue = arr[0]; // Initialize with the value of the first element

        // Iterate from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i]; // Update the maximum value
                maxIndex = i; // Update the index of the first occurrence of the new maximum
            }
        }
        return maxIndex;
    }
}
