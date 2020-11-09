package com.example.util.dataSet;



import com.example.util.expections.DataStructurExpections;

public interface LinearDatasets<T> {

    default void insert(T value, int index) throws DataStructurExpections{
        throw new UnsupportedOperationException("inserts with index are not suport");
    };
    T delete(int index);
    int search(T value);
    T findIndex(int index);
    void sort();
    String show();
    T[] toArray();
    boolean inEmpty();

}
