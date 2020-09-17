package com.dimitar.algorithms.linkedlist;


public class LinkedListLoopDetector {

    public LinkedListImpl.Node head;

    public void addBack(LinkedListImpl.Node newNode) {

        // if head... set and return
        if (head == null) {
            head = newNode;
            return;
        }

        // Else starting at head...
        LinkedListImpl.Node current = head;

        // Walk until to hit tail
        while (current.next != null) {
            current = current.next;
        }

        // Set current node to equal newNode
        current.next = newNode;
    }

    //
    // Solution: Loop detection
    //
    // This is an implementation of Floyd's cycle-finding algorithm for detecting loops
    // https://en.wikipedia.org/wiki/Cycle_detection#Tortoise_and_hare
    // https://stackoverflow.com/questions/2663115/how-to-detect-a-loop-in-a-linked-list

    public boolean hasLoop() {
        return hasLoop(head);
    }

    public static boolean hasLoop(LinkedListImpl.Node first) {
        LinkedListImpl.Node slow = first;
        LinkedListImpl.Node fast = first;

        while(fast != null && fast.next != null) {
            slow = slow.next;          // 1 hop
            fast = fast.next.next;     // 2 hops

            if(slow == fast)  // fast caught up to slow, so there is a loop
                return true;
        }
        return false;  // fast reached null, so the list terminates
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedListImpl<>();


        LinkedListImpl.Node node1 = new LinkedListImpl.Node<Integer>(1);
        LinkedListImpl.Node node2 = new LinkedListImpl.Node<Integer>(2);
        LinkedListImpl.Node node3 = new LinkedListImpl.Node<Integer>(3);
        LinkedListImpl.Node node4 = new LinkedListImpl.Node<Integer>(4);
        LinkedListImpl.Node node5 = new LinkedListImpl.Node<Integer>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        System.out.println(hasLoop(node1));
    }
}
