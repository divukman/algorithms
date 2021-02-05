package com.dimitar.algorithms.mix;

/**
 * Detect loop in linked list
 */
public class LinkedListLoopDetector {


    private static class Node <T> {
        public T data;
        public Node next;

        public Node(final T data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        final Node<Integer> node1 = new Node<Integer>(1);
        final Node<Integer> node2 = new Node<Integer>(2);
        final Node<Integer> node3 = new Node<Integer>(3);
        final Node<Integer> node4 = new Node<Integer>(4);
        final Node<Integer> node5 = new Node<Integer>(5);
        final Node<Integer> node6 = new Node<Integer>(6);
        final Node<Integer> node7 = new Node<Integer>(7);


        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 1
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node1; // LOOP

        final Node head = node1;

        Node ptrSlow = head;
        Node ptrFast = head.next;

        while (ptrFast != null && ptrFast.next != null) {
            ptrSlow = ptrSlow.next;
            ptrFast = ptrFast.next.next;

            if(ptrFast == ptrSlow) {
                System.out.println("LOOP DETECTED");
                return;
            }
        }

        System.out.println("No loop");

     }

}
