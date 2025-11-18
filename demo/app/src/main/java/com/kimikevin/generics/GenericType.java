package com.kimikevin.generics;

public class GenericType<T> {
    /**
     * A field of "some type"
     */
    private T value;

    /**
     * Takes a value of "some type" and assigns it to the field
     */
    public GenericType(T value) {
        this.value = value;
    }

    /**
     * Returns a value of "some type"
     */
    public T get() {
        return value;
    }

    /**
     * Takes a value of "some type", assigns it to a field and then returns it
     */
    public T set(T value){
        this.value = value;
        return this.value;
    }
}
