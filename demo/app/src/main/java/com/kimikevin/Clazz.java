package com.kimikevin;

public class Clazz {
    int magic;

    public Clazz(int magic) {
        this.magic = magic;
    }

    public static int staticMethod(int a) {
        return a + a;
    }

    public int instanceMethod(int b) {
        return b * magic;
    }

    public static void main(String[] args) {
        Clazz clazz = new Clazz(10);
        System.out.println(clazz.instanceMethod(2));

        System.out.println(Clazz.staticMethod(20));
    }
}
