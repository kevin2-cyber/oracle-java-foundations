package com.kimikevin.debugging;

public class Caller {
    public static void main(String[] args) {
        startConversation();
    }

    private static void startConversation() {
        String reply = Responder.getResponse("Hello from Caller!");
        System.out.println(reply);
    }
}
