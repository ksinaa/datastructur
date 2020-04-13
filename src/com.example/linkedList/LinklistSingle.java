package com.example.linkedList;

import com.example.datasets.LinearDatasets;
import com.example.expections.LinkedListOverflowExpection;
import linkedList.node.Node;


import java.text.MessageFormat;


public class LinklistSingle<T> implements LinearDatasets<T> {

    private Node head;
    private int maxSize;
    private int currentSize;

    public LinklistSingle() {
        this.head = new Node();
        this.maxSize = Integer.MAX_VALUE;
        this.currentSize = 0;
    }
    public LinklistSingle(int size) {
        this.head = new Node();
        this.maxSize = size;
        this.currentSize = 0;
    }

    @Override
    public void insert(T value, int index)  {

        //check if linked list size is more or equal of max size
        try {
            linkedListOverflowExpection();
        } catch (LinkedListOverflowExpection linkedListOverflowExpection) {
            return;
        }

        if(this.currentSize == 0){
            head.setNext(null);
            head.setValue(value);
            this.currentSize++;
            return;
        }

        Node newNode = new Node(value);
        Node temp = travers(index);

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        this.currentSize++;
    }

    public void insert(T value){
        insert(value, this.currentSize);
    }

    @Override
    public T delete(T value, int index) {
        return null;
    }

    //TODO add more delete option (overload delete here)


    @Override
    public int search(T value) {
        return 0;
    }

    @Override
    public T findIndex(int index) {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public String show() {

        String resualt = "[";
        Node temp = this.head;

        for (int i = 0; i < currentSize; i++) {
            if(i == this.currentSize - 1){
                resualt += MessageFormat.format(" {0} ", temp.getValue());
                break;
            }
            resualt += MessageFormat.format(" {0} , ", temp.getValue());
            temp = temp.getNext();
        }

        return resualt + "]";
    }

    @Override
    public T[] toArray() {

        //java.util.list;
        Node temp = this.head;
        return null;

    }

    @Override
    public boolean inEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    public Node travers(int index){

        if(index > this.currentSize){
            throw new IndexOutOfBoundsException(MessageFormat.format("index {0} out of range (list size = {1}) ", index, this.currentSize));
        }

        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    public void linkedListOverflowExpection() throws LinkedListOverflowExpection{
        if(this.currentSize >= maxSize)
            throw new LinkedListOverflowExpection
                    (MessageFormat.format("list is full, current size = {0}, max size = {1}", this.currentSize, this.maxSize));
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void test(){
        Node temp = this.head;

        for (int i = 0; i < currentSize; i++) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }

    }
}
