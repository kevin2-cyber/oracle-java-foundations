package com.kimikevin.runtime;

public class Main {
    public static void main(String[] args) {
        Object obj = " ";

        if (obj instanceof String str && str.length() > 0) {
            if (str.isBlank()) {
                System.out.println("The variable is empty or contains only a whitespace");
            }
        }

        class Shape {}
        class Circle extends Shape {}
        class Rectangle extends Shape {}

        Shape circle = new Circle();

        boolean equalsCircle = circle.getClass() == Circle.class; // true
        boolean equalsShape = circle.getClass() == Shape.class;   // false
        boolean rectangle = circle.getClass() == Rectangle.class; // false

        boolean isInstanceOfCircle = Circle.class.isInstance(circle); // true
        boolean isInstanceOfShape = Shape.class.isInstance(circle); // true
        boolean isInstanceOfRectangle = Rectangle.class.isInstance(circle); // false
    }
}
