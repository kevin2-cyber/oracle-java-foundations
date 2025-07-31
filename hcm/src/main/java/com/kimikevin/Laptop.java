package com.kimikevin;

class Laptop {
    private String info;

    void receiveInfo(String info) {
        this.info = info;
    }
}

class MobileGadget {

    protected void printNotification(String data) {
        System.out.println(data);
    }
}

class SmartPhone extends MobileGadget {

    private Laptop connectedLaptop;

    public SmartPhone() {
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String info) {
        printNotification("Sending info to laptop : "  + info);
        connectedLaptop.receiveInfo(info);
    }
}

class SmartWatch extends MobileGadget {

    private int avgHeartRate;
    private Laptop connectedLaptop;

    public SmartWatch() {
        this.avgHeartRate = 75;
        this.connectedLaptop = new Laptop();
    }

    private int countHeartRate() {
        System.out.println("Counting heart rate");
        return avgHeartRate;
    }

    private void sendInfoToLaptop(String info) {
        printNotification("Sending info to laptop : "  + info);
        connectedLaptop.receiveInfo(info);
    }
}
