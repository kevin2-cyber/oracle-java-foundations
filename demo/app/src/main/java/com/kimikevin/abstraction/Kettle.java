package com.kimikevin.abstraction;

public class Kettle extends AbstractDevice {
    protected double volume;
    public Kettle(String serialNumber, double volume) {
        super(serialNumber);
        this.volume = volume;
    }

    @Override
    public void on() {
        // do complex logic to activate all electronic components
        setOn(true);
        System.out.println("Kettle is on");
    }

    @Override
    public void off() {
        // do complex logic to stop all electronic components
        setOn(false);
        System.out.println("Kettle is off");
    }
}
