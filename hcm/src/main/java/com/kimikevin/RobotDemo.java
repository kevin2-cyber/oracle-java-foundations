package com.kimikevin;

public class RobotDemo {
    public static void main(String[] args) {
        Robot ben = new Robot();

//        ben.moveRobot(0, 0); // needed to avoid java.awt.AWTException: Cannot initialize Robot
//
//        ben.delay(100); // added to separate movements
//
//        ben.keyPress(17); // to release the mouse
//        ben.mouseMove(0, 0);

        ben.moveRight(3);
        ben.moveUp(2);
        ben.moveLeft(4);
        ben.moveUp(2);
        ben.moveRight(1);
    }
}

class Robot {
    int x, y;

    public void moveRight(int steps) {
        x += steps;
    }

    public void moveUp(int steps) {
        y += steps;
    }

    public void moveLeft(int steps) {
        x -= steps;
        if (x < 0) {
            x = 0;
        }
    }

    public void moveDown(int steps) {
        y -= steps;
        if (y < 0) {
            y = 0;
        }
    }
}
