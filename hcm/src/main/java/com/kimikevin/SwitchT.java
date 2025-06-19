package com.kimikevin;

public class SwitchT {
    public static void main(String[] args) {
        char ch = 'a';
        int num = 0;
        switch(ch) {
            case 'a':
                num = 10;
            case 'b':
                num = 20;
            default:
                num = 30;
        }
    }
}
