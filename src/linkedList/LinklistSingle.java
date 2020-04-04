package linkedList;

import datasets.LinearDatasets;
import datasets.expections.LinkedListOverflowExpection;
import linkedList.node.Node;


public class LinklistSingle<T> implements LinearDatasets<T> {

    private Node head;
    private int maxSize;
    private int currentSize;

    public LinklistSingle() {
        this.head = new Node();
        this.maxSize = Integer.MAX_VALUE;
        this.currentSize = 0;
    }
    public LinklistSingle(int size)
    {
        this.head = new Node();
        this.maxSize = size;
        this.currentSize = 0;
    }

    @Override
    public void insert(T value, int index) throws LinkedListOverflowExpection {

        if(this.currentSize >= maxSize)
            throw new LinkedListOverflowExpection("list is full, current size = " + this.currentSize + ", max size = " + this.maxSize);

        //TODO add body of insert into here


        this.currentSize++;
    }

    public void insert(T value){


    }

    @Override
    public T delete(T value, int index) {
        return null;
    }

    //TODO add more delete option (overload delete here


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
    public void toArray() {

    }
}
