package com.dimitar.algorithms.queue;

import com.dimitar.algorithms.linkedlist.NewLinkedListImpl;

public class MyQueueImpl <T> implements MyQueue <T> {

    private Node head = null;
    private Node tail = null;

    private static class Node <T> {
        public T data;
        public Node next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    /**
     * Add to the BACK of the list.
     * @param data
     */
    @Override
    public void add(T data) {
        // Create node
        final Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
    }

    /**
     * Remove from the FRONT of the list.
     * @return data or null
     */
    @Override
    public T remove() {
        T data = null;
        if (head == tail) { //1 element
            head = null;
            tail = null;
        } else {
            data = (T) head.data;
            head = head.next;
        }
        return data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    void printQueue() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}
