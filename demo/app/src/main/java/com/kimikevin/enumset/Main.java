package com.kimikevin.enumset;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<BallsColor> ballsColors = EnumSet.of(BallsColor.GREEN, BallsColor.BLUE);
        System.out.println(ballsColors);

        EnumSet<BallsColor> colorSet = EnumSet.allOf(BallsColor.class);
        System.out.println(colorSet);

        EnumSet<BallsColor> enumSet = EnumSet.noneOf(BallsColor.class);
        System.out.println(enumSet);

        EnumSet<BallsColor> newColorsSet = EnumSet.complementOf(ballsColors);
        System.out.println(newColorsSet);

        EnumSet<BallsColor> ballsRange = EnumSet.range(BallsColor.RED, BallsColor.YELLOW);
        System.out.println(ballsRange);
    }
}
