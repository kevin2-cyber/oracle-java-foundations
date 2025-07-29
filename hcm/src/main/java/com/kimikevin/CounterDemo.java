package com.kimikevin;

public class CounterDemo {
    public static void main(String[] args) {
        Counter  counter = new Counter();
        counter.inc();
        System.out.println(counter.getCurrent());
    }
}

class Counter {
    private long current = 0;

    public long getCurrent() {
        return this.current;
    }

    public void inc() {
        inc(1L);
    }

    private void inc(long value) {
        this.current += value;
    }
}
