package com.dimitar.algorithms.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DynamicArray <T> implements Array <T> {
    private Object[] data;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity) {
        log.info("Creating a DynamicArray with initial capacity of " + initialCapacity);
        this.capacity = initialCapacity;
        data = new Object[initialCapacity];
        size = 0; // this is the default
    }

    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public void set(int index, T value) {

    }

    @Override
    public void insert(int index, T value) {

    }

    @Override
    public void add(T value) {
        log.info("Adding value " + value);
        increaseIfNoCapacity();
        data[size] = value;
        size++;
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

    /***
     * Util method to double the array size if there is not enough room left.
     * Should be called before inserting an element.
     */
    private void increaseIfNoCapacity() {
        if (size == capacity) { // We are full and new element has no place to go to, increase the size.
            final int newCapacity = capacity * 2;
            log.info("Not enough room, increasing the array capacity to " + newCapacity);
            final Object[] newArray = new Object[newCapacity];
            capacity = newCapacity;

            // Copy elements from old array to new one
            for (int i = 0; i < size; i ++) {
                newArray[i] = data[i];
            }

            // Switch pointers (references)
            this.data = newArray;
        }
    }
}
