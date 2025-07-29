package com.kimikevin;

public class PatientDemo {

    public static void main(String[] args) {

        Patient john = new Patient();
        john.setName("John");
        john.setAge(30);
        john.setHeight(180);

        System.out.println(john.getName() + " " + john.getAge() + " " + john.getHeight());

        Patient alice = new Patient();
        alice.setName("Alice");
        alice.setAge(22);
        alice.setHeight(165);

        System.out.println(alice.getName() + " " + alice.getAge() + " " + alice.getHeight());
    }
}

class Patient {

   private String name;
    private int age;
    private float height;
    public Patient() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
