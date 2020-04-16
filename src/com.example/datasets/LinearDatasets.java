package com.example.datasets;



import com.example.expections.LinkedListOverflowExpection;

public interface LinearDatasets<T> {

    void insert(T value, int index) throws LinkedListOverflowExpection;
    T delete(int index);
    int search(T value);
    T findIndex(int index);
    void sort();
    String show();
    T[] toArray();
    boolean inEmpty();

}
