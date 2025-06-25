package com.kimikevin;

import java.util.Arrays;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 }; // numbers

        System.out.println(Arrays.toString(numbers)); // before swapping

        swapFirstAndLastElements(numbers); // swapping

        System.out.println(Arrays.toString(numbers)); // after swapping
    }

    public static void swapFirstAndLastElements(int[] numbers) { // nums is an array
        if(numbers.length < 1) {
            return; // it returns nothing, i.e. just exits the method
        }

        int temp = numbers[numbers.length - 1]; // save the last element in a temporary local variable
        numbers[numbers.length - 1] = numbers[0]; // now, the last element becomes the first
        numbers[0] = temp; // now, the first element becomes the former last
    }
}
