package com.kimikevin.social;

public abstract class SocialNetwork {
    public void connect(){
        login();
        post();
        logout();
    }

    public abstract void login();
    public abstract void post();
    public abstract void logout();
}
