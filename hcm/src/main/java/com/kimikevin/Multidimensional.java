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


//        // maximum element in a matrix of size n and m
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int max = Integer.MIN_VALUE;
//        int maxRow = 0;
//        int maxCol = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int val = scanner.nextInt();
//                if (val > max) {
//                    max = val;
//                    maxRow = i;
//                    maxCol = j;
//                }
//            }
//        }
//
//        System.out.println( maxRow + " " + maxCol);

//        // swap the columns
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int[][] matrix = new int[n][m];
//        for (int k = 0; k < n; k++) {
//            for (int l = 0; l < m; l++) {
//                matrix[k][l] = scanner.nextInt();
//            }
//        }
//
//        int i = scanner.nextInt();
//        int j = scanner.nextInt();
//
//        for (int k = 0; k < n; k++) {
//            int temp = matrix[k][i];
//            matrix[k][i] = matrix[k][j];
//            matrix[k][j] = temp;
//        }
//
//        for (int k = 0; k < n; k++) {
//            for (int l = 0; l < m; l++) {
//                System.out.print(matrix[k][l] + " ");
//            }
//            System.out.println();
//        }

//        // rotate a rectangle array
//        Scanner scanner = new Scanner(System.in);
//
//        // Read dimensions
//        if (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//            int m = scanner.nextInt();
//
//            // Read the matrix
//            int[][] matrix = new int[n][m];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    matrix[i][j] = scanner.nextInt();
//                }
//            }
//
//            // Print the rotated matrix
//            // Outer loop iterates through original columns (j becomes the new row index)
//            for (int j = 0; j < m; j++) {
//                // Inner loop iterates through original rows backwards (i becomes part of the new column logic)
//                for (int i = n - 1; i >= 0; i--) {
//                    System.out.print(matrix[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }

    }
}
