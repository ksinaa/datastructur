package com.example.nonLinear.tree;


import com.example.util.dataSet.NonLinearDatasets;

public class BinaryTree<T> implements NonLinearDatasets<T> {

    private final BinaryNode head;
    private int currentNodeCounter;
    private int maxNode;


    public BinaryTree(int maxNode) {
        this.maxNode = maxNode;
        this.head = null;
        this.currentNodeCounter = 0;
    }

    public BinaryTree() {
        this.head = null;
        this.currentNodeCounter = 0;
    }

    @Override
    public void insert(T value) {

        if(currentNodeCounter >= maxNode){
            throw new IndexOutOfBoundsException("current node is equal to max node. delete something to add new");
        }

        currentNodeCounter++;

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
    public T search(T value, String searchType) {

        if(searchType == "inorder"){
            return inorder(value);
        }else if
        (searchType == "preorder"){
            return postorder(value);
        }else if
        (searchType == "preorder"){
            return preorder(value);
        }else{
            throw new IllegalArgumentException("enter inorder preorder or postorder!");
        }
    }

    @Override
    public T findIndex(int index) {
        return null;
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

    public T inorder(T value){
        return null;
    }

    public T preorder(T value){
        return null;
    }

    public T postorder(T value){
        return null;
    }



    //TODO adding prefix and post fix methods for search
}
