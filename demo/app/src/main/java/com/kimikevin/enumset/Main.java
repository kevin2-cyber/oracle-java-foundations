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

        EnumSet<Status> statuses = EnumSet.range(Status.RECEIVED, Status.DISPATCHED);
        statuses.remove(Status.CHECKING);
        statuses.remove(Status.DISPATCHED);

        statuses.add(Status.CHECKING);

        // Notice how Checking Enum is placed at the correct position
        // as in Status class in spite of adding it afterwards
        System.out.println(statuses);
        System.out.println(statuses.contains(Status.PROCESSING));
    }
}
