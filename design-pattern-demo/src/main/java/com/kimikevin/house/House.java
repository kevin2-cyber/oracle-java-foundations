package com.kimikevin.house;

public abstract class House {
    public void build(){
        chooseLocation();
        placeFoundations();
        placeWalls();
        placeWindows();
        placeDoors();
        placeRoofs();
        connectElectricity();
    }
    public abstract void placeFoundations();
    public abstract void placeWalls();
    public abstract void placeWindows();
    public abstract void placeDoors();

    public void chooseLocation() {
        System.out.println("Choose the best location for the new house");
    }

    public void placeRoofs() {
        System.out.println("Place metal sheet roofs");
    }

    public void connectElectricity() {
        System.out.println("Connect the house to the electrical grid");
    }
}
