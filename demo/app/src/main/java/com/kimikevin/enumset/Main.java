package com.kimikevin.enumset;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<BallsColor> ballsColors = EnumSet.of(BallsColor.GREEN, BallsColor.BLUE);
        System.out.println(ballsColors);
    }
}
