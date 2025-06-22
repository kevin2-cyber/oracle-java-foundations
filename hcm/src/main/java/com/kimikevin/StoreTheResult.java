package com.kimikevin;

public class StoreTheResult {
    public static void main(String[] args) {
        StoreResultUtil storeResultUtil = new StoreResultUtil();
        double myDouble = 4.5;
        int result = storeResultUtil.myMethod(myDouble);
        System.out.println(result);
    }
}

class StoreResultUtil {
    public int myMethod(double num) {
        return (int) num * 2;
    }
}
