package com.kimikevin;

public class PrintArrayMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
