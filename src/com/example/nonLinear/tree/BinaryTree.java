package com.example.nonLinear.tree;

import com.example.util.dataSet.NonLinearDatasets;

public class BinaryTree<T> implements NonLinearDatasets<T> {

    private BinaryNode head;
    private int nodeNumber;
    private int maxNode;


    public BinaryTree(int maxNode) {
        this.maxNode = maxNode;
        this.head = null;
        this.nodeNumber = 0;
    }

    public BinaryTree() {
        this.head = null;
        this.nodeNumber = 0;
    }

    @Override
    public void insert(T value) {

        if(this.head == null){
            this.head.setValue(value);
            this.head.setLeft(null);
            this.head.setRight(null);
        }


    }

    @Override
    public T delete(int index) {
        return null;
    }

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
        return null;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean inEmpty() {
        return false;
    }
}
