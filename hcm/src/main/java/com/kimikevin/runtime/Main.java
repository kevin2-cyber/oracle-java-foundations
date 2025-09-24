package com.kimikevin.runtime;

public class Main {
    public static void main(String[] args) {
        Object obj = " ";

        if (obj instanceof String str && str.length() > 0) {
            if (str.isBlank()) {
                System.out.println("The variable is empty or contains only a whitespace");
            }
        }

        class A { }

        class B extends A { }

        class C extends B { }

        A ac = new C();
        A ab = new B();

        boolean test = ab instanceof A;
    }
}
