package com.dimitar.algorithms.arrays;

import java.util.Arrays;

public class NewDynamicArray <T> implements Array <T> {
    private final int initialCapacity;
    private int capacity;
    private Object[] data;
    private int size;


    /**
     * Constructor
     * @param initialCapacity
     */
    public NewDynamicArray(final int initialCapacity) {
        this.initialCapacity = initialCapacity;

        this.capacity = initialCapacity;
        this.data = new Object[initialCapacity];
        this.size = 0;
    }

    @Override
    public T get(int index) {
        checkBounds(index);
        return (T) data[index];
    }

    @Override
    public void set(int index, T value) {
        checkBounds(index);
        data[index] = value;
    }

    @Override
    public void insert(int index, T value) {
        checkBounds(index);
        if (size == capacity) {
            increaseCapacity();
        }

        for (int i = size + 1; i >= index + 1; i--) {
            data[i] = data[i-1];
        }

        data[index] = value;
        size++;
    }

    @Override
    public void add(T value) {
        if (size == capacity) {
            increaseCapacity();
        }
        data[size] = value;
        size++;
    }



    @Override
    public void delete(int index) {
        checkBounds(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        data[size - 1] = null;
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean Contains(T value) {
        return Arrays.stream(data).filter(o -> o.equals(value)).count() > 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void increaseCapacity() {
        final int newCapacity = size + initialCapacity;
        final Object[] newdata = new Object[newCapacity];

        for (int i = 0; i < data.length; i++) {
            final Object obj = data[i];
            newdata[i] = obj;
        }

        data = newdata;
        capacity = newCapacity;
    }

    private void checkBounds(final int index) {
        if (index < 0 || index > (size - 1)) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
