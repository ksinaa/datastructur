package linkedList;

import datasets.LinearDatasets;
import linkedList.node.Node;


public class LinklistSingle<T> implements LinearDatasets<T> {

    private Node head;

    public LinklistSingle() {
        this.head = new Node();
    }

    @Override
    public void insert(T value, int index) {

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
