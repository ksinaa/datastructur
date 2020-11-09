package com.example.util.dataSet;



import com.example.util.expections.DataStructurExpections;

public interface LinearDatasets<T> {

    void insert(T value, int index) throws DataStructurExpections;
    T delete(int index);
    int search(T value);
    T findIndex(int index);
    void sort();
    String show();
    T[] toArray();
    boolean inEmpty();

}
