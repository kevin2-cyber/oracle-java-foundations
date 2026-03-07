package com.kimikevin;

public interface Interface {
    int INT_CONSTANT = 0; // it's a constant, the same as public static

    void instanceMethod1();
    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method");
    }

    private void privateMethod() {
        System.out.println("Interface: private method");
    }
}
