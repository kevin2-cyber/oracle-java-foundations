package com.kimikevin.abstraction;

public abstract class BaseMessage implements Message {
    String sender;
    String dest;

    public BaseMessage(String sn, String dst) {
        sender = sn;
        dest = dst;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getDest() {
        return dest;
    }
}
