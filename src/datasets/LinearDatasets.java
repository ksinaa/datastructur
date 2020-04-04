package datasets;


import datasets.expections.LinkedListOverflowExpection;

public interface LinearDatasets<T> {

    void insert(T value, int index) throws LinkedListOverflowExpection;
    T delete(T value, int index);
    int search(T value);
    T findIndex(int index);
    void sort();
    String show();
    void toArray();



}
