package com.dimitar.algorithms.stack;

// Design a stack which, in addition to push and pop, has a function min
// which returns the minimum element. Push/pop operate in O(1)

public class StackWithMin <T extends Comparable<T>> implements MyStack <T> {

    private static class Node <T> {
        public T data;
        public T min;
        public Node next;

        public Node(final T data) {
            this.data = data;
        }
    }

    private Node<T> head = null;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(T data) {
        final Node newNode = new Node(data);
        newNode.min = data;
        if (head != null) {
            newNode.min = data.compareTo(head.min) < 0 ? newNode.data : head.min;
            newNode.next = head;
        }
        head = newNode;
    }

    @Override
    public T pop() {
        T result = null;
        if (head != null) {
            result = head.data;
            head = head.next;
        }
        return result;
    }


    public T min() {
        T min = null;
        if (head != null) {
            min = head.min;
        }
        return min;
    }
}
