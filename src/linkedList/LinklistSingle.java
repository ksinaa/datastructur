package linkedList;

import datasets.LinearDatasets;
import expections.LinkedListOverflowExpection;
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

        Node prev = new Node(value);
        Node temp = travers(index);

        temp.setNext(prev.getNext());
        prev.setNext(temp);
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
        //TODO or create toString
        return null;
    }

    @Override
    public void toArray() {

    }

    @Override
    public boolean inEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    public Node travers(int index){

        if(inEmpty()){
            throw new IndexOutOfBoundsException(MessageFormat.format("current sie = {0}", this.currentSize));
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    public void linkedListOverflowExpection() throws LinkedListOverflowExpection{
        if(this.currentSize >= maxSize)
            throw new LinkedListOverflowExpection
                    (MessageFormat.format("list is full, current size = {0}, max size = {1}", this.currentSize, this.maxSize));
    }
}
