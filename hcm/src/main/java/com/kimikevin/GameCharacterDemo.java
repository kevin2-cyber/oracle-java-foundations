package com.kimikevin;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

class GameCharacter {
    @NotNull
    private String login;

    @Range(min = 1, max = 100)
    private int level;

    public GameCharacter(
            @NotNull String login,
            @Range(min = 1, max = 100) int level) {

        this.login = login;
        this.level = level;
    }

    @NotNull
    public String getLogin() {
        return login;
    }

    @Range(min = 1, max = 100)
    public int getLevel() {
        return level;
    }
}

public class GameCharacterDemo {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter("user", 50);
        System.out.println("Login: " + gameCharacter.getLogin());
        System.out.println("Level: " + gameCharacter.getLevel());
    }
}
