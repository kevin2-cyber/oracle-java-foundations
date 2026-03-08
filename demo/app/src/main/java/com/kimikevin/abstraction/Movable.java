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

class Spiderman implements Movable, Jumpable {

    @Override
    public void jump() {
        System.out.println( "Spiderman: jump");
    }

    @Override
    public void turnLeftJump() {
        System.out.println( "Spiderman: turnLeftJump");
    }

    @Override
    public void turnRightJump() {
        System.out.println( "Spiderman: turnRightJump");
    }

    @Override
    public void stepAhead() {
        System.out.println( "Spiderman: stepAhead");
    }

    @Override
    public void turnLeft() {
        System.out.println( "Spiderman: turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println( "Spiderman: turnRight");
    }

    @Override
    public void turnAround() {
        Movable.super.turnAround();
        Jumpable.super.turnAround();
    }
}
