package com.kimikevin;

import java.util.Scanner;

public class MaxOfParam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println("The Max index: " + getNumberOfMaxParam(a, b, c));
    }

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        if(a >= b) {
            if(a >= c) {
                return 1;
            } else {
                return 3;
            }
        } else {
            if(b >= c) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
