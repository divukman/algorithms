package com.dimitar.algorithms.facebook;

public class Tree <T> {

    private static class Node <T> {
        public T value;
        public Node left = null;
        public Node right = null;

        public Node(final T value) {
            this.value = value;
        }

        public Node copy() {
            final Node newNode = new Node(this.value);
            newNode.left =  left != null ? this.left.copy() : null;
            newNode.right = right != null ? this.right.copy() : null;
            return newNode;
        }
    }


    // In order traversal
    public static void inOrderTraversal(final Node root) {
        // left, root, right
       if (root != null) {
           if (root.left != null) {
               inOrderTraversal(root.left);
           }
           System.out.println(root.value + " ");
           if (root.right != null) {
               inOrderTraversal(root.right);
           }
       }
    }


    public static void main(String[] args) {
        final Node node1 = new Node(1);
        final Node node2 = new Node(2);
        final Node node3 = new Node(3);
        final Node node4 = new Node(4);
        final Node node5 = new Node(5);
        final Node node6 = new Node(6);
        final Node node7 = new Node(7);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        inOrderTraversal(node1);
    }



}
