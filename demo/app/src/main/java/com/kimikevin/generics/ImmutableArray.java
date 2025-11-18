package com.kimikevin.generics;

public class ImmutableArray<T> {
    private final T[] items;

    public ImmutableArray(T[] items) {
        this.items = items.clone();
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
