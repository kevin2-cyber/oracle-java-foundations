package com.kimikevin.comparable;

public class Coin implements Comparable<Coin>{
    private final int nominalValue;
    private final int mintYear;

    Coin(int nominalValue, int mintYear) {
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    public int getNominalValue() {
        return nominalValue;
    }

    public int getMintYear() {
        return mintYear;
    }

    @Override
    public int compareTo(Coin other) {
        if (nominalValue == other.nominalValue) {
            return 0;
        } else if (nominalValue < other.nominalValue) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Coin coin = (Coin) that;
        return nominalValue == coin.nominalValue;
    }

    @Override
    public int hashCode() {
        return nominalValue ^ mintYear;
    }

    @Override
    public String toString() {
        return "Coin{nominal=" + nominalValue + ", year=" + mintYear + "}";
    }
}
