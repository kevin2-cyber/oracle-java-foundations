package com.kimikevin.abstraction;

import com.kimikevin.Clazz;

public class Main {
    public static void main(String[] args) {
        Interface anInterface = new ClassImpl();
        anInterface.instanceMethod1();
        anInterface.instanceMethod2();
        anInterface.defaultMethod();

        AbstractDevice kettle = new Kettle("123456789", 100);
        kettle.on();
        kettle.off();

        ManagedDevice kettle1 = new Kettle("123456789", 100);
        kettle1.on();
        kettle1.off();

        Feature feature = new FeatureImpl();
        feature.action();

        Movable spiderman = new Spiderman();
        spiderman.turnAround();

        Movable batman = new Batman();
        batman.turnAround();

        Clazz instance = new Clazz(10);
        int integerInstance = instance.instanceMethod(2);
        System.out.println(integerInstance);

        System.out.println(Clazz.staticMethod(30));

    }
}