package com.kimikevin.abstraction;

public interface Message {

    String getSender();
    String getDest();
    String getText();
}

abstract class BaseMessage implements Message {
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

class CipherMessage extends BaseMessage{
    protected String text;
    public CipherMessage(String sender, String destination, String text) {
        super(sender, destination);
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
