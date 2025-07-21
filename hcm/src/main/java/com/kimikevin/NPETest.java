package com.kimikevin;

import java.util.Objects;

public class NPETest {
    public static void main(String[] args) {
        String str = null;

//        if (str.equals("abc")) { // it throws an NPE
//            System.out.println("The same");
//        }

//        if ("abc".equals(str)) { // no NPE here
//            System.out.println("The same");
//        }

        String s1 = null;
        String s2 = null;

        if (Objects.equals(s1, s2)) { // no NPE here
            System.out.println("Strings are the same");
        }
    }
}
