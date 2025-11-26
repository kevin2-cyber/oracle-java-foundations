package com.kimikevin;

public class ArrayExceptions {
    public static void main(String[] args) {
//        // NullPointerException
//        int[] numbers = null;
//        int size = (numbers == null) ? 0 : numbers.length; // It throws an NPE
//        System.out.println(size);
//
//        // NegativeArraySizeException
//        int negZise = -1;
//        int[] numbersNeg = new int[negZise];
//        System.out.println(numbersNeg.length);

        // ArrayIndexOutOfBoundsException
        int[] array = { 1, 2, 3 }; // an array of ints

        int n1 = array[2]; // n1 is 3
        int n2 = array[3]; // Exception

        System.out.println(array[0]);  // OK
        int n3 = array[-1];// Exception

    }
}
