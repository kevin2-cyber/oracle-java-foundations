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
        return Integer.compare(nominalValue, other.nominalValue);
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
        return "Coin(" +
                "nominalValue=" + nominalValue +
                ", mintYear=" + mintYear +
                ")";
    }
}
