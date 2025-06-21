package com.kimikevin;

import java.util.Scanner;

public class CalculateNumberFromInput {
    // Method to read input from user and separate the integers
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // Call the appropriate function depending on the number of integers in the input
        if (intArr.length == 2) {
            // Call calculate(int, int)
            calculate(intArr[0], intArr[1]);
            // TO DO: Fill in the appropriate code here
        } else if (intArr.length == 3) {
            // Call calculate(int, int, int)
            calculate(intArr[0], intArr[1], intArr[2]);
            // TO DO: Fill in the appropriate code here
        }
    }

    public static void calculate(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void calculate(int num1, int num2, int num3) {
        System.out.println((num1 + num2) * num3);
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();
    }
}
