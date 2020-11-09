package com.example.nonLinear.tree;


import com.example.util.dataSet.NonLinearDatasets;

public class BinaryTree<T> implements NonLinearDatasets<T> {

    private final BinaryNode head;
    private final int nodeNumber;
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

        BinaryNode valueObject = new BinaryNode();
        valueObject.setValue(value);
        valueObject.setRight(null);
        valueObject.setLeft(null);

        if(this.head == null){
            this.head.setValue(value);
            this.head.setLeft(null);
            this.head.setRight(null);
            return;
        }

        BinaryNode temp = this.head;

        while (true){
            if( (Integer)value >= (Integer)temp.getValue() ){
                if(temp.getRight() == null){
                    temp.setRight(valueObject);
                    return;
                }
                temp = temp.getRight();
            }else {
                if(temp.getLeft() == null){
                    temp.setLeft(valueObject);
                    return;
                }
                temp = temp.getLeft();
            }

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

    //TODO adding prefix and post fix methods for search
}
