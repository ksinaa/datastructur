package com.example;


import com.example.linkedList.LinklistSingle;

public class Main {

    public static void main(String[] args) {

        LinklistSingle<Integer> list = new LinklistSingle<>();
        list.insert(3, 0);
        list.insert(2, 1);
        list.insert(1, 2);
        list.insert(0, 3);
        list.insert(5);
        list.insert(5);
        list.insert(5);
        list.test();
        System.out.println(list.show());





    }
}
