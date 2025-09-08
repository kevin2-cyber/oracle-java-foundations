package com.kimikevin.abstractexample;

public class Cat extends Pet{
    protected Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meow!");
    }
}
