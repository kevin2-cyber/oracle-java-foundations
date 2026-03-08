package com.kimikevin.abstraction;

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

class ClassImpl implements Interface {
    @Override
    public void instanceMethod1() {
        System.out.println("Class: instance method1");
    }

    @Override
    public void instanceMethod2() {
        System.out.println("Class: instance method2");
    }
}
