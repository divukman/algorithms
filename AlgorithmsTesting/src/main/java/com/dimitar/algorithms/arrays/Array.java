package com.dimitar.algorithms.arrays;

public interface Array <T> {

    T get(int index);
    void set (int index, T value);
    void insert (int index, T value);
    void add(T value);
    void delete (int index);
    boolean isEmpty();
    boolean Contains(T value);

}
