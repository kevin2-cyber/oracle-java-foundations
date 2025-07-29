package com.kimikevin;

public class PatientDemo {

    public static void main(String[] args) {

        Patient john = new Patient("John", 30, 180);

        System.out.println(john.getName() + " " + john.getAge() + " " + john.getHeight());

        Patient alice = new Patient("Alice", 22, 165);

        System.out.println(alice.getName() + " " + alice.getAge() + " " + alice.getHeight());
    }
}

class Patient {

   private String name;
    private int age;
    private float height;

    public Patient(String name,  int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

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
