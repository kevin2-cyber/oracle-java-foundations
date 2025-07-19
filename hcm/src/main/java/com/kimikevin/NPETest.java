package com.kimikevin;

public class NPETest {
    public static void main(String[] args) {
        String str = null;

        if (str.equals("abc")) { // it throws an NPE
            System.out.println("The same");
        }
    }
}
