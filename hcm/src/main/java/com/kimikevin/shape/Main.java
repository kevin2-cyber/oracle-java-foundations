package com.kimikevin.shape;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3,4,5);
        System.out.println("Perimeter of a triangle: " + triangle.getPerimeter());
        System.out.println("Area of a triangle: " + triangle.getArea());

        Shape rectangle = new Rectangle(5,10);
        System.out.println("Perimeter of a Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of a Rectangle: " + rectangle.getArea());

        Shape circle = new Circle(10);
        System.out.println("Circumference of a circle: " + circle.getPerimeter());
        System.out.println("Area of a circle: " + circle.getArea());
    }
}

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}
class Triangle extends Shape {
    protected double a;
    protected double b;
    protected double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) *(s-b)*(s-c));
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
