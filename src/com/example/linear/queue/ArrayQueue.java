package com.example.linear.queue;

import java.util.ArrayList;

public class ArrayQueue<T> implements Queue<T> {
    private int head;
    private int tail;

    private int size;
    private ArrayList<T> queue;

    public ArrayQueue(int head, int tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
        this.queue = new ArrayList<>();
    }

    public ArrayQueue() {

    }

    @Override
    public void push(T value) {
        queue.add(value);
    }

    @Override
    public T pop() {
        return queue.remove(0);
    }

    @Override
    public boolean isEmpty() {
        if(queue.size() <= 0) return true;
        else return false;
    }

    @Override
    public String toString() {
       return this.queue.toString();
    }
}
