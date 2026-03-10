package com.kimikevin.abstraction;

public class Main {
    public static void main(String[] args) {
        Interface instance = new ClassImpl();
        instance.instanceMethod1();
        instance.instanceMethod2();
        instance.defaultMethod();

        AbstractDevice kettle = new Kettle("123456789", 100);
        kettle.on();
        kettle.off();

        Feature feature = new FeatureImpl();
        feature.action();

        Movable spiderman = new Spiderman();
        spiderman.turnAround();
    }
}