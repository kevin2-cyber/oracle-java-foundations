package com.kimikevin.abstraction;

public interface Feature {
    default void action() {
        String answer = subAction();
        System.out.println(answer);
    }

    private String subAction() {
        return "Default action";
    }
}

class FeatureImpl implements Feature{ }