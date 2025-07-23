package com.kimikevin;

public class NPETry {
    public static void main(String[] args) {
        String str = "hello";
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught null pointer exception!");
        }
    }
}
