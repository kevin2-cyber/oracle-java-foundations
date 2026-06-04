package com.kimikevin.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            integerDeque.push(x);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(integerDeque.pop());
        }

    }
}