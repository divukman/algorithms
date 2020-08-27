package com.dimitar.algorithms.arrays;

public class DynamicArray <T> implements Array <T> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
        size = 0; //this is the default anyway
    }

    public T get(int index) {
        return null;
    }

    @Override
    public void set(int index, T value) {

    }

    @Override
    public void insert(int index, T value) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean Contains(T value) {
        return false;
    }
}
