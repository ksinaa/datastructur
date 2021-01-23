package com.example.linear.stack;

import com.example.linear.linkedList.Linklist;

public class Stack<T> {

    Linklist<T> stack;

    public Stack(){
        this.stack = new Linklist<>();
    }

    public void push(T value){
        this.stack.insert(value);
    }

    public T pop(){
        return this.stack.delete(this.stack.size() - 1);
    }

    public boolean isEmpty(){
        return this.stack.inEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack.show() +
                '}';
    }


}
