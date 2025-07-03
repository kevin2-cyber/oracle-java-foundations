package com.kimikevin;

public class FinalVar {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final String HELLO_MSG = "Hello";

        System.out.println(PI);
        System.out.println(HELLO_MSG);

        final int count = 10;
        int cnt = count;
        cnt = 20; // no errors here, cnt is not final
        System.out.println(count);
        System.out.println(cnt);

        final StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        System.out.println(builder);
    }
}
