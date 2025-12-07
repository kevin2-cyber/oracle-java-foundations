package com.kimikevin.debugging;

public class StepDemo {
    public static void main(String[] args) {
        int result = calculateSum(5,10);
        System.out.println("The sum is: " + result);
    }

    public static int calculateSum(int a, int b) {
        System.out.println("Calculating sum...");
        return a + b;
    }
}
