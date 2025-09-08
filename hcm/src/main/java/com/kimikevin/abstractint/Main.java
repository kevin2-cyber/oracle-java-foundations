package com.kimikevin.abstractint;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperation addition = new Addition(2,4);
        System.out.println(addition.perform());
        IntBinaryOperation multiplication = new Multiplication(2,4);
        System.out.println(multiplication.perform());
    }
}
