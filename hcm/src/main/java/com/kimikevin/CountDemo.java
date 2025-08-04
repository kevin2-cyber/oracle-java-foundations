package com.kimikevin;


class Count {

    protected int i = 1221;

    void printCount(){
        System.out.println(i);
    }

    void incCount(){
        i = i + 1;
    }

}
public class CountDemo {
    public static void main(String[] args) {
        Count counter = new Count();
        System.out.println(counter.i);
    }
}
