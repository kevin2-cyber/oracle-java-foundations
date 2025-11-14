package com.kimikevin.house;

public class Wooden extends House{
    @Override
    public void placeFoundations() {
        System.out.println("Place a wooden foundation");
    }

    @Override
    public void placeWalls() {
        System.out.println("Place wooden walls");
    }

    @Override
    public void placeWindows() {
        System.out.println("Place wooden windows");
    }

    @Override
    public void placeDoors() {
        System.out.println("Place wooden doors");
    }
}
