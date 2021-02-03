package com.dimitar.algorithms.linkedlist;

import junit.framework.TestCase;

public class LinkedListImplTest extends TestCase {

    public void testRemoveDuplicates() {
        LinkedListImpl<Integer> list = new LinkedListImpl<>();

        list.addBack(1);
        list.addBack(2);
        list.addBack(1);
        list.addBack(4);
        list.addBack(1);

        list.print();
        list.removeDuplicates();

        System.out.println(" *** *** *** ");
        list.print();

    }
}