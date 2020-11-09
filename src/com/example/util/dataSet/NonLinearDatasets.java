package com.example.util.dataSet;

import com.example.util.expections.DataStructurExpections;

public interface NonLinearDatasets<T> extends LinearDatasets<T>{

    void insert(T value);

    @Override
    default void insert(T value, int index) throws DataStructurExpections {
        throw new UnsupportedOperationException("inserts with index are not suport in non-linear datasets");
    }


}
