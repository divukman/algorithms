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

    public void testDeleteDuplicates() {
        final NewLinkedListImpl<String> newLinkedList = new NewLinkedListImpl<>();

        newLinkedList.addBack("Hello");
        newLinkedList.addBack("World");
        newLinkedList.addBack("!");
        newLinkedList.addBack("Hello");
        newLinkedList.addBack("World");
        newLinkedList.addBack("!");
        newLinkedList.addBack("World");
        newLinkedList.addBack("World");
        newLinkedList.addBack("World");

        newLinkedList.printNodes();
        System.out.println();
        System.out.println(" --- ");
        newLinkedList.deleteDuplicates();
        newLinkedList.printNodes();
    }

    public void testDeleteDuplicates2() {
        final NewLinkedListImpl<String> newLinkedList = new NewLinkedListImpl<>();

        newLinkedList.addBack("Hello");
        newLinkedList.addBack("World");
        newLinkedList.addBack("!");
        newLinkedList.addBack("Hello");
        newLinkedList.addBack("World");
        newLinkedList.addBack("!");
        newLinkedList.addBack("World");
        newLinkedList.addBack("World");
        newLinkedList.addBack("World");

        newLinkedList.printNodes();
        System.out.println();
        System.out.println(" --- ");
        newLinkedList.deleteDuplicates2();
        newLinkedList.printNodes();
    }
}