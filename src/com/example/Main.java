package com.example;

import com.example.linear.linkedList.Linklist;

public class Main {

    public static void main(String[] args) {
        Linklist<Integer> list = new Linklist<>();

        list.insert(5);
        list.insert(6);
        list.insert(2);
        list.insert(6);

        list.delete(1);

        System.out.println(list.show());

    }
}
