package datasets;


public interface LinearDatasets<T> {

    void insert(T value, int index);
    T delete(T value, int index);
    int search(T value);
    T findIndex(int index);
    void sort();
    String show();
    void toArray();



}
