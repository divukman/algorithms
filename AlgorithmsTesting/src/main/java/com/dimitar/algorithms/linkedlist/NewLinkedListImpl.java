package com.dimitar.algorithms.linkedlist;

import java.util.HashSet;

public class NewLinkedListImpl <T> implements NewLinkedList<T> {

    private Node head = null;


    private static class Node <T> {
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public void addFront(T data) {
        final Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addBack(T data) {
        if (head == null) {
            addFront(data);
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }

            final Node newNode = new Node(data);
            ptr.next = newNode;
        }
    }

    @Override
    public T getFirst() {
        return head != null ? (T) head.data : null; //@todo: ? throw IllegalStateException("Empty List!") ? create a separate method for that
    }

    @Override
    public T getLast() {
        if (head == null) {
            return null;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            return (T) ptr.data;
        }
    }

    @Override
    public int size() {
        int count = 0;

        if (head != null) {
           Node ptr = head;
           count = 1;

           while (ptr.next != null) {
               ptr = ptr.next;
               count++;
           }
        }

        return count;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public void delete(T value) {
        if (head != null) {
            Node ptr = head;

            if (ptr.data.equals(value)) {
                head = head.next;
            } else {
                while (ptr.next != null) {
                    boolean found = ptr.next.data.equals(value);
                    if (!found) {
                        ptr = ptr.next;
                    } else {
                        ptr.next = ptr.next.next;
                    }
                }
            }
        }
    }

    public void printNodes() {
        if (head != null) {
            Node ptr = head;
            do {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            } while (ptr != null);
        }
    }

    public void deleteDuplicates() {
        if (head != null && head.next != null) {
            Node ptr = head;
            HashSet<T> hashSet = new HashSet<>();
            hashSet.add((T) ptr.data);

            while(ptr != null && ptr.next != null) { // While I do have next
                if ( hashSet.contains((T) ptr.next.data) ) {
                    // remove it
                    ptr.next = ptr.next.next;
                } else {
                    // not duplicate
                    ptr = ptr.next;
                    hashSet.add((T) ptr.data);
                }
            }
        }
    }
}
