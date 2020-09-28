package com.dimitar.algorithms.mix;

public class StackPushPopMinO1_2 {

    public static class MinStack {

        private Node head = null;

        private class Node {
            public int data;
            public int min;
            public Node next;
        }


        void push(int val) {
            final Node newNode = new Node();
            newNode.data = val;
            if (head != null) {
                newNode.min = Math.min(head.min, newNode.data);
            } else {
                newNode.min = newNode.data;
            }

            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (head == null) return 0;

            int val = head.data;
            head = head.next;
            return val;
        }

        int min() {
            return head.min;
        }
    }

    public static void main(String[] args) {
        final MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1);
        minStack.push(5);

        System.out.println("MIN: " + minStack.min());
    }
}
