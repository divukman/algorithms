package com.dimitar.algorithms.linkedlist;

public class LinkedListImpl<T> implements LinkedList<T> {
    private Node<T> head = null;

    public static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public void addFront(T data) {
        final Node<T> newNode = new Node<T>(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    @Override
    public void addBack(T data) {
        final Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    @Override
    public Node<T> getFirst() {
        return head;
    }

    @Override
    public Node<T> getLast() {
        Node<T> result = head;

        if (result != null) {
           while (result.next != null) {
               result = result.next;
           }
        }

        return result;
    }

    @Override
    public T getLastValue() {
        Node<T> last = getLast();
        return last != null ? last.data : null;
    }

    @Override
    public T getFirstValue() {
        Node<T> last = getFirst();
        return last != null ? last.data : null;
    }

    @Override
    public int size() {
        int result = 0;

        if (head != null) {
            Node ptr = head;
            result++;

            while (ptr.next != null) {
                ptr = ptr.next;
                result++;
            }
        }

        return result;
    }

    @Override
    public void clear() {
        //This is Java, let Garbage Collector do its work.
        this.head = null;
    }

    @Override
    public void delete(T value) {
        if (head != null) {

            // If head
            if(head.data == value) {
                head = head.next; // null or element
            } else {
                Node ptr = head;

                while(ptr.next != null) {
                    if (ptr.next.data == value) { //Check next node, if found, bypass it
                        ptr.next = ptr.next.next;
                        return;
                    }
                    ptr = ptr.next;
                }
            }
        }
    }


}
