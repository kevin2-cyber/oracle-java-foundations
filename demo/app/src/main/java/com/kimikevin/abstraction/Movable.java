package com.kimikevin.abstraction;

public interface Movable {
    void stepAhead();
    void turnLeft();
    void turnRight();

    default void turnAround() {
        turnLeft();
        turnLeft();
    }
}

interface Jumpable {
    void jump();
    void turnLeftJump();
    void turnRightJump();
    default void turnAround() {
        turnLeftJump();
        turnLeftJump();
    }
}

class Batman implements Movable {
    @Override
    public void stepAhead() {
        System.out.println("Batman: stepAhead");
    }

    @Override
    public void turnLeft() {
        System.out.println("Batman: turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println("Batman: turnRight");
    }

    @Override
    public void turnAround() {
        turnRight();
        turnRight();
    }
}
