package com.kimikevin;

public class NPETest {
    public static void main(String[] args) {
        String str = null;

//        if (str.equals("abc")) { // it throws an NPE
//            System.out.println("The same");
//        }

        if ("abc".equals(str)) { // no NPE here
            System.out.println("The same");
        }
    }
}
