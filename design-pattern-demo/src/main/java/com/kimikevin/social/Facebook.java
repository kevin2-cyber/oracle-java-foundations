package com.kimikevin.social;

public class Facebook extends SocialNetwork{

    @Override
    public void login() {
        System.out.println( "Log into Facebook");
    }

    @Override
    public void post() {
        System.out.println("Post: Hello, Facebook!");
    }

    @Override
    public void logout() {
        System.out.println("Log out of Facebook");
    }
}
