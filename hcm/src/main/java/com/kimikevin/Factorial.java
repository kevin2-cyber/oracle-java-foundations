package com.kimikevin;

import java.util.Scanner;

public class Factorial {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        long n = Integer.parseInt(scanner.nextLine().trim());
////        System.out.println(factorial(n));
//        int input = scanner.nextInt();
//        int i = 1;
//        long factorial = 1;
//
//        while (i <= input) {
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Integer.parseInt(sc.nextLine().trim());
    System.out.println(factorial(n));
}
    public static long factorial(long n) {
        // write your code here
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
