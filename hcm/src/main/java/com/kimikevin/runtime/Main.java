package com.kimikevin.runtime;

public class Main {
    public static void main(String[] args) {
        class Shape {}

        class Circle extends Shape {}

        class Rectangle extends Shape {}

        Shape circle = new Circle();  // the reference is Shape, the object is Circle
        Shape rect = new Rectangle(); // the reference is Shape, the object is Rectangle

        boolean circleIsCircle = circle instanceof Circle; // true
        boolean circleIsRectangle = circle instanceof Rectangle; // false
        boolean circleIsShape = circle instanceof Shape; // true

        boolean rectIsRectangle = rect instanceof Rectangle; // true
        boolean rectIsCircle = rect instanceof Circle; // false
        boolean rectIsShape = rect instanceof Shape; // true
    }
}
