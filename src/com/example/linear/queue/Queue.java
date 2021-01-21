package com.example.linear.queue;

public interface Queue<T>{

    void push(T value);
    T pop();
    boolean isEmpty();
}
