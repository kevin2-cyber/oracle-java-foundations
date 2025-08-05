package com.kimikevin;

public class DemoSuperClass {
    public static void main(String[] args) {
        A a1 = new A(); // (1)
        A a2 = new C(); // (2)

        B b1 = new B(); // (3)
        B b2 = new A(); // (4)
        B b3 = new C(); // (5)

        C c1 = new B(); // (6)
        C c2 = new C(); // (7)
    }
}

class A {
    private int test;

    public int getTest(){
        return test;
    }
}

class B extends A {
    private int text;
    public int getText(){
        return text;
    }
}

class C extends B {
    private int wordCount;
    public int getWordCount(){
        return wordCount;
    }
}
