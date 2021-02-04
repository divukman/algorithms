package com.dimitar.algorithms.stack;

public class MyStackImpl <T> implements MyStack <T> {

    private Node head = null;

    private class Node <T> {
        public T data = null;
        public Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(T data) {
        final Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public T pop() {
        T result = null;

        if (head != null) { // Or throw an exception instead of returning null
            result = (T) head.data;
            head = head.next;
        }

        return result;
    }

    public void printStack() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}
