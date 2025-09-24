package com.kimikevin.runtime;

import java.util.ArrayList;
import java.util.List;

class SortShapeDemo {
    public static void sortShapes(
            Shape[] array,
            List<Shape> shapes,
            List<Polygon> polygons,
            List<Square> squares,
            List<Circle> circles
    ){
        // write your code here
        // solution 1
        for (Shape shape : array) {
            switch (shape.getClass().getName()) {
                case "Shape":
                    shapes.add(shape);
                    break;
                case "Polygon":
                    polygons.add((Polygon) shape);
                    break;
                case "Square":
                    squares.add((Square) shape);
                    break;
                case "Circle":
                    circles.add((Circle) shape);
            }
        }

        // solution 2
        for (Shape shape: array) {
            if (shape instanceof Square) {
                squares.add((Square) shape);
            } else if (shape instanceof Polygon) {
                polygons.add((Polygon) shape);
            } else if (shape instanceof Circle) {
                circles.add((Circle) shape);
            } else {
                shapes.add(shape);
            }
        }
    }
    public static void main(String[] args) {
        Shape[] arr = { new Circle(), new Square(), new Polygon(), new Square(), new Circle(), new Polygon()};
        List<Shape> shapes = new ArrayList<>();
        List<Polygon> polygons = new ArrayList<>();
        List<Square> squares = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();

        sortShapes(arr, shapes, polygons, squares, circles);

        System.out.println("Shapes: " + shapes.size());
        System.out.println("Polygons: " + polygons.size());
        System.out.println("Squares: " + squares.size());
        System.out.println("Circles: " + circles.size());
    }
}

class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }
