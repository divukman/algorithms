package com.dimitar.algorithms.linkedlist;

import junit.framework.TestCase;

public class NewLinkedListImplTest extends TestCase {

    public void testAddFront() {
        final NewLinkedListImpl<String> newLinkedList = new NewLinkedListImpl<>();

        newLinkedList.addFront("!");
        newLinkedList.addFront("World");
        newLinkedList.addFront("Hello");

        newLinkedList.printNodes();
    }

    public void testAddBack() {
        final NewLinkedListImpl<String> newLinkedList = new NewLinkedListImpl<>();

        newLinkedList.addBack("Hello");
        newLinkedList.addBack("World");
        newLinkedList.addBack("!");

        newLinkedList.printNodes();
    }

    public void testGetFirst() {
    }

    public void testGetLast() {
    }

    public void testSize() {
    }

    public void testClear() {
    }

    public void testDelete() {
        final NewLinkedListImpl<String> newLinkedList = new NewLinkedListImpl<>();

        newLinkedList.addBack("Hello");
        newLinkedList.addBack("World");
        newLinkedList.addBack("!");

        newLinkedList.delete("World");

        newLinkedList.printNodes();
    }
}