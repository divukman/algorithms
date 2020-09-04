package com.dimitar.algorithms.binarytree;

public class Node<T extends Comparable<T>> {
    T value;
    Node left;
    Node right;

    public Node(T val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }

}
