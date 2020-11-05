package com.example.linkedList;

import com.example.datasets.LinearDatasets;
import com.example.expections.LinkedListOverflowExpection;
import com.example.linkedList.node.Node;


import java.text.MessageFormat;
import java.util.ArrayList;


public class Linklist<T> implements LinearDatasets<T> {

    private Node head;
    private final long maxSize;
    private int currentSize = 0;

    public Linklist() {
        this.head = new Node();
        this.maxSize = Long.MAX_VALUE;
    }
    public Linklist(int size) {
        this.head = new Node();
        this.maxSize = size;
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
    public T delete(int index) {

        if(index == 0){
            Node temp = head;
            head = head.getNext();
            currentSize--;
            return (T)temp.getValue();
        }

        Node prev = travers(index - 1);
        Node temp = prev.getNext();

        prev.setNext(temp.getNext());
        currentSize--;
        return (T)temp.getValue();
    }

    public int deleteByValue(T value){

        int index = 0;
        Node temp = this.head;

        for (int i = 0; i < currentSize; i++) {
            if(temp.getValue() == value){
                delete(index + 1);
                return index;
            }

            index++;
            temp = temp.getNext();
        }


        return -1;
    }

    @Override
    public int search(T value) {
        return 0;
    }

    @Override
    public T findIndex(int index) {
        return (T)this.travers(index).getValue();
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
        return null;
    }

    @Override
    public boolean inEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    private Node travers(int index){

        if(index > this.currentSize){
            throw new IndexOutOfBoundsException(MessageFormat.format("index {0} out of range (list size = {1}) ", index, this.currentSize));
        }

        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    private void linkedListOverflowExpection() throws LinkedListOverflowExpection{
        if(this.currentSize >= maxSize)
            throw new LinkedListOverflowExpection
                    (MessageFormat.format("list is full, current size = {0}, max size = {1}", this.currentSize, this.maxSize));
    }

    public int getCurrentSize() {
        return currentSize;
    }


}
