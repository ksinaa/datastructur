package com.example.linear.queue;

import com.example.linear.linkedList.Linklist;

public class LinkedListQueue<T> implements Queue<T>{

    private int head;
    private int tail;
    private Linklist queue;

    public LinkedListQueue(Linklist queue){
        this.queue = queue;
        head = 0;
        tail = 0;
    }


    @Override
    public void push(Object value) {
        this.queue.insert(value);
    }

    @Override
    public void pop() {
        if(isEmpty()) throw new IndexOutOfBoundsException("queue is empty");
        this.queue.delete(0);
    }

    @Override
    public boolean isEmpty() {
        return this.queue.inEmpty();
    }

    @Override
    public String toString() {
        return "LinkedListQueue{" +
                "queue=" + this.queue.show() +
                '}';
    }
}
