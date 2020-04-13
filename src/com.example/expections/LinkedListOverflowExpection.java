package com.example.expections;

public class LinkedListOverflowExpection extends Exception {

    public LinkedListOverflowExpection() {

    }

    public LinkedListOverflowExpection(String message) {
        super(message);
    }
}
