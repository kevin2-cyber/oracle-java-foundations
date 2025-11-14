package com.kimikevin.social;

public class Instagram extends SocialNetwork{
    @Override
    public void login() {
        System.out.println( "Log into Instagram");
    }

    @Override
    public void post() {
        System.out.println("Post: Hello, Instagram!");
    }

    @Override
    public void logout() {
        System.out.println("Log out of Instagram");
    }
}
