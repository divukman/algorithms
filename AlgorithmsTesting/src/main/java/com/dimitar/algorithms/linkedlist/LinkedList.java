package com.dimitar.algorithms.linkedlist;

public interface LinkedList<T> {
    void addFront(T data);
    void addBack(T data);
    LinkedListImpl.Node<T> getFirst();
    LinkedListImpl.Node<T> getLast();
    T getLastValue();
    T getFirstValue();
    int size();
    void clear();
    void delete(T value);
}
