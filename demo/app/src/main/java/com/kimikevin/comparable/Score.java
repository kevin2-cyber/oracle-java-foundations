package com.kimikevin.comparable;

import java.util.Comparator;

public class Score implements Comparable<Score>{
    private final String player;
    private final int totalScore;

    public Score(String player, int totalScore) {
        this.player = player;
        this.totalScore = totalScore;
    }

    public String getPlayer() {
        return player;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return player + '=' + totalScore;
    }

    @Override
    public int compareTo(Score other) {
        int scoreComparison = Integer.compare(this.totalScore, other.totalScore);

        if (scoreComparison != 0) {
            return scoreComparison;
        }

        return this.player.compareTo(other.player);
    }
}
