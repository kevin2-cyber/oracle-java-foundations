package com.kimikevin.abstraction;

public class CipherMessage extends BaseMessage{
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
