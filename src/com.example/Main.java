package com.example;


import com.example.linkedList.Linklist;


public class Main {

    public static void main(String[] args) {

        Linklist list = new Linklist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println(list.show());


        list.delete(2);

        System.out.println(list.show());

        list.deleteByValue(5);

        System.out.println(list.show());




    }

}
