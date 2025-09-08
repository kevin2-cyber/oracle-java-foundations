package com.kimikevin.numbergenerator;

public class Main {
    public static void main(String[] args) {
        BaseNumberGenerator generator = new MagicNumberGenerator(10);
        System.out.println(generator.generate());
    }
}
