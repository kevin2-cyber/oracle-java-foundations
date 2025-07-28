package com.kimikevin;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex number = new Complex();
        number.real = 10;
        number.image = 4;
        // math expression of number = 10.0 + 4.0i

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;
        // math expression of anotherNumber = 6.0 + 6.0i

        number.add(anotherNumber); // number = 16.0 + 10.0i
        number.subtract(anotherNumber);
    }
}

class Complex {
    double real;
    double image;

    void add(Complex anotherNumber) {
        this.real += anotherNumber.real;
        this.image += anotherNumber.image;
    }

    void subtract(Complex anotherNumber) {
        this.real -= anotherNumber.real;
        this.image -= anotherNumber.image;
    }
}
