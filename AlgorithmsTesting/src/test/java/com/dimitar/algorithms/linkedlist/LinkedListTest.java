package com.dimitar.algorithms.linkedlist;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

    private LinkedListImpl<Integer> linkedList;

    public void testGetLastAndFirst() {
        this.linkedList = new LinkedListImpl<Integer>();
        this.linkedList.addFront(Integer.valueOf(1));
        this.linkedList.addFront(Integer.valueOf(2));
        this.linkedList.addFront(Integer.valueOf(3));

        assertEquals( this.linkedList.getLastValue().intValue(), 1);
        assertEquals( this.linkedList.getFirstValue().intValue(), 3);
    }


    public void testAddBack() {
        this.linkedList = new LinkedListImpl<Integer>();
        this.linkedList.addBack(Integer.valueOf(1));
        this.linkedList.addBack(Integer.valueOf(2));
        this.linkedList.addBack(Integer.valueOf(3));
        this.linkedList.addBack(Integer.valueOf(4));
        this.linkedList.addBack(Integer.valueOf(5));

        assertEquals( this.linkedList.getFirstValue().intValue(), 1);
        assertEquals( this.linkedList.getLastValue().intValue(), 5);

    }

    public void testSize() {
        this.linkedList = new LinkedListImpl<Integer>();
        this.linkedList.addBack(Integer.valueOf(1));
        this.linkedList.addBack(Integer.valueOf(2));
        this.linkedList.addBack(Integer.valueOf(3));
        this.linkedList.addBack(Integer.valueOf(4));
        this.linkedList.addBack(Integer.valueOf(5));

        assertEquals( this.linkedList.size(), 5);
    }

    public void testDelete() {
        this.linkedList = new LinkedListImpl<Integer>();
        this.linkedList.addBack(Integer.valueOf(1));
        this.linkedList.addBack(Integer.valueOf(2));
        this.linkedList.addBack(Integer.valueOf(3));
        this.linkedList.addBack(Integer.valueOf(4));
        this.linkedList.addBack(Integer.valueOf(5));

        assertEquals( this.linkedList.size(), 5);
        this.linkedList.delete(3);
        assertEquals( this.linkedList.size(), 4);
        this.linkedList.delete(5);
        assertEquals( this.linkedList.getLastValue().intValue(), 4);
        assertEquals( this.linkedList.size(), 3);
    }

    public void testTraverse() {
        this.linkedList = new LinkedListImpl<Integer>();
        this.linkedList.addBack(Integer.valueOf(1));
        this.linkedList.addBack(Integer.valueOf(2));
        this.linkedList.addBack(Integer.valueOf(3));
        this.linkedList.addBack(Integer.valueOf(4));
        this.linkedList.addBack(Integer.valueOf(5));

        LinkedListImpl.Node ptr = linkedList.getFirst();
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
}