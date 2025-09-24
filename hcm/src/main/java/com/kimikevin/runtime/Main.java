package com.kimikevin.runtime;

public class Main {
    public static void main(String[] args) {
        Object obj = " ";

        if (obj instanceof String str && str.length() > 0) {
            if (str.isBlank()) {
                System.out.println("The variable is empty or contains only a whitespace");
            }
        }

        class Shape {
        }

        class Shape2D extends Shape {
        }

        class Shape3D extends Shape {
        }


        class Circle extends Shape2D {
        }

        class Shape2DSub1 extends Shape2D {
        }

        class Shape2DSub2 extends Shape2D {
        }


        class Cube extends Shape3D {
        }

        class Shape3DSub1 extends Shape3D {
        }

        class Shape3DSub2 extends Shape3D {
        }
    }
}
