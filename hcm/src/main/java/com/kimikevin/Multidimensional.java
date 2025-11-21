package com.kimikevin;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
//        int[][] twoDimArray = {
//                {0,0,0},
//                {0,0,0},
//                {0,0,0},
//        };

//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[i].length; j++) {
//                System.out.print(twoDimArray[i][j] + " ");
//            }
//        }
//
//        int[][] twoDimArrayVar = {
//                {0,0},
//                {1,2,3,4},
//                {3,3,3}
//        };
//        System.out.println("\n----------------------------------------");
//
//        for (int i = 0; i < twoDimArrayVar.length; i++) {
//            for (int j = 0; j < twoDimArrayVar[i].length; j++) {
//                System.out.print(twoDimArrayVar[i][j] + " ");
//            }
//        }
//
//        int[][] twoDimArrayFixed = new int[2][10];
//        for (int i = 0; i < twoDimArrayFixed.length; i++) {
//            for (int j = 0; j < twoDimArrayFixed[i].length; j++) {
//                twoDimArrayFixed[i][j] = 1;
//            }
//            System.out.println("\n" + Arrays.toString(twoDimArrayFixed[i]));
//        }
//
//        int[][][] threeDimArray = new int[2][3][4];
//        int element = 0;
//
//        for (int i = 0; i < threeDimArray.length; i++) {
//            for (int j = 0; j < threeDimArray[i].length; j++) {
//                for (int k = 0; k < threeDimArray[i][i].length; k++) {
//                    threeDimArray[i][j][k] = element;
//                }
//                element++;
//            }
//        }
//
//        for (int[][] ints : threeDimArray) {
//            for (int[] anInt : ints) {
//                System.out.print(Arrays.toString(anInt) + " ");
//            }
//            System.out.println();
//        }


        // maximum element in a matrix of size n and m
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = scanner.nextInt();
                if (val > max) {
                    max = val;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println( maxRow + " " + maxCol);
    }
}
