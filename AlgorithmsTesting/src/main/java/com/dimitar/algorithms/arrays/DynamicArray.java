package com.dimitar.algorithms.arrays;

public class DynamicArray<T> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
        size = 0;
    }

    public T get(int index) {
        return null;
    }
}
