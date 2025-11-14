package com.kimikevin.house;

public class Stone extends House{
    @Override
    public void placeFoundations() {
        System.out.println( "Place a stone foundation");
    }

    @Override
    public void placeWalls() {
        System.out.println("Place stone walls");
    }

    @Override
    public void placeWindows() {
        System.out.println("Place reinforced windows");
    }

    @Override
    public void placeDoors() {
        System.out.println("Place reinforced doors");
    }
}
