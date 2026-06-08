package com.kimikevin.comparable;

import java.util.List;

public class Rating implements Comparable<Rating>{
    private int upVotes;
    private int downVotes;

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    @Override
    public int compareTo(Rating rating) {
        return Integer.compare(this.upVotes - this.downVotes, rating.upVotes - rating.downVotes);
    }
}

class Checker {
    static void check(List<Rating> list) {
        for (int i = 1; i < list.size(); i++) {
            var curr = list.get(i);
            var prev = list.get(i  - 1);
            if (curr.getUpVotes() - curr.getDownVotes() < prev.getUpVotes() - prev.getDownVotes()) {
                System.out.println("Incorrect sorted order");
                return;
            }
        }
        System.out.println("Correct sorted order");
    }
}
