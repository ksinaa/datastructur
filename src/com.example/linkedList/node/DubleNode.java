package com.example.linkedList.node;

//Node for double link lists
public class DubleNode<T> {

    private T value;
    private DubleNode next;
    private DubleNode prev;

    public DubleNode(T value, DubleNode next, DubleNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public DubleNode() {
        this.value = null;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DubleNode getNext() {
        return next;
    }

    public void setNext(DubleNode next) {
        this.next = next;
    }

    public DubleNode getPrev() {
        return prev;
    }

    public void setPrev(DubleNode prev) {
        this.prev = prev;
    }
}
