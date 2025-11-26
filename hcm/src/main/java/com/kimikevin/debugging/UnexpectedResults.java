package com.kimikevin.debugging;

public class UnexpectedResults {
    public static void main(String[] args) {
        count(1,10);
    }

    public static void count(int start, int to) {
        while (start < to) {
            System.out.println(start);
            start++;
        }
    }
}
