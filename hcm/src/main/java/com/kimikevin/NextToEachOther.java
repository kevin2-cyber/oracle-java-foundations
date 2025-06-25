package com.kimikevin;

import java.util.Scanner;

public class NextToEachOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(isNextToEachOther(array,n,m));
    }

    public static boolean isNextToEachOther(int[] array, int n, int m) {
        boolean isNumberNextToEachOther = true;
        for (int i = 0; i < array.length - 1; i++) {
            if((array[i] == n && array[i + 1] == m) || (array[i] == m && array[i + 1] == n)) {
                isNumberNextToEachOther = false;
                break;
            }
        }
        return isNumberNextToEachOther;
    }
}
