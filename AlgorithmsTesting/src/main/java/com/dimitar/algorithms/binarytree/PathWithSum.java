package com.dimitar.algorithms.binarytree;

import java.util.ArrayList;

/**
 * Binary tree (not bst), can have negatives.
 * Print paths that have target sum.
 */
public class PathWithSum {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node (final int value) {
            this.value = value;
        }
    }

    public Node root = null;

   /* public void insert(final int value) {
        root = insertNode(root,value);
    }

    private Node insertNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        } else {
            if (root.value > value) {
                root.left = insertNode(root.left, value);
            } else {
                root.right = insertNode(root.right, value);
            }
        }

        return root;
    }*/

    public static void printPath(final ArrayList<Integer> array) {
        System.out.print("Path: " );
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        System.out.println("*** *** ***");
    }

    public static void pathWithSum(int sum, final int targetSum, ArrayList<Integer> path, final Node currentNode) {
        sum += currentNode.value;
        path.add(currentNode.value);
        if (sum == targetSum) {
            printPath(path);
        }

        //branch left and right
        if (currentNode.left != null) {
            final ArrayList<Integer> newPath = new ArrayList<>(path);
            pathWithSum(sum, targetSum, newPath, currentNode.left);
        }
        if (currentNode.right  != null) {
            final ArrayList<Integer> newPath = new ArrayList<>(path);
            pathWithSum(sum, targetSum, newPath, currentNode.right);
        }

        // branch left and right, but with completely empty paths
        if (currentNode.left != null) {
            pathWithSum(0, targetSum, new ArrayList<Integer>(), currentNode.left);
        }
        if (currentNode.right  != null) {
            pathWithSum(0, targetSum, new ArrayList<Integer>(), currentNode.right);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        Node node5 = new Node(5);
        Node nodeM3 = new Node(-3);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node3_2 = new Node(3);
        Node nodeM2 = new Node(-2);
        Node node1 = new Node(1);
        Node node11 = new Node(11);

        root.left = node5;
        root.right = nodeM3;

        node5.left = node3;
        node5.right = node2;

        nodeM3.right = node11;

        node3.left = node3_2;
        node3.right = nodeM2;

        node2.right = node1;

        pathWithSum(0, 8, new ArrayList<Integer>(), root);
    }

}
