package com.kimikevin.abstraction;

public interface Feature {
    default void action() {
        System.out.println("Default action");
    }
}
