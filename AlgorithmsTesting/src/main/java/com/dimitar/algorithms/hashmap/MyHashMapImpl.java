package com.dimitar.algorithms.hashmap;

/**
 * Hash map using the linked list.
 */
public class MyHashMapImpl<T, S> implements MyHashMap <T, S> {

    private static int SIZE = 16;

    private static class Node <T, S> {
        public T key;
        public S value;
        public Node next;

        public Node(T key, S value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node [] array;

    public MyHashMapImpl() {
        array = new Node[SIZE];
    }

    /**
     * @todo: use bitwise
     * @todo: if duplicate key, replace
     *
     * @param key
     * @param value
     */
    @Override
    public void add(T key, S value) {
        final Node newNode = new Node(key, value);
        int arrayPosition = key.hashCode() % SIZE;

        if (arrayPosition < 0) { // use bitwise operator
            arrayPosition = Math.abs(arrayPosition);
        }

        if (array[arrayPosition] == null) {
            array[arrayPosition] = newNode;
        } else {
            Node ptr = array[arrayPosition];
            while (ptr.next != null) ptr = ptr.next;
            ptr.next = newNode;
        }

    }

    @Override
    public S get(T key) {
        int arrayPosition = key.hashCode() % SIZE;

        if (arrayPosition < 0) { // use bitwise operator
            arrayPosition = Math.abs(arrayPosition);
        }

        if (array[arrayPosition] == null) {
            return null;
        } else {
            Node ptr = array[arrayPosition];
            while (ptr != null && !ptr.key.equals(key)) {
                ptr = ptr.next;
            }
            return ptr != null ? (S)ptr.value : null;
        }
    }


}
