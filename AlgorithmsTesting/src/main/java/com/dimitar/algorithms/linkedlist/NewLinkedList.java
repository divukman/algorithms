package com.dimitar.algorithms.linkedlist;

public interface NewLinkedList <T> {
    void addFront(T data);
    void addBack(T data);
    T getFirst();
    T getLast();
    int size();
    void clear();
    void delete(T value);
}
