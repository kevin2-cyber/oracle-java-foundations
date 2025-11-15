package com.kimikevin.abstractint;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperation addition = new Addition(2,4);
        System.out.println(addition.perform());
        IntBinaryOperation multiplication = new Multiplication(2,4);
        System.out.println(multiplication.perform());

        float hexFloat = 0x5.0p0f;   // 5.0 in hexadecimal form. Here 'f' indicates float
        double hexDouble = 0xf.8p3; // 15.5 x 2^3 = 124.0 Here 'f' is part of number f.8
        System.out.println(hexFloat);
        System.out.println(hexDouble);

        int num = 28;
        System.out.println(num);
    }
}
