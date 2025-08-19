package com.kimikevin;

public class ConstantsDemo {
    public static void main(String[] args) {
        System.out.println(Constants.A_CONSTANT_TTT);
        System.out.println(Constants.B_CONSTANT_QQQ);
        System.out.println(Constants.getMagicString());
        System.out.println(Constants.convertStringToAnotherString("aa"));
    }
}

class Constants {
    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}
