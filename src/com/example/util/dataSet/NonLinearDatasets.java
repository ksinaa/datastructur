package com.example.util.dataSet;

public interface NonLinearDatasets<T> extends LinearDatasets<T>{

    @Override
    void insert(T value, int index);


}
