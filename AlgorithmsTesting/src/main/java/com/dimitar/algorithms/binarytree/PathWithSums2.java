package com.dimitar.algorithms.binarytree;

import java.util.ArrayList;

public class PathWithSums2 {

    private static int counter = 0;

    private static class Node <T> {
        public T val;
        public Node left;
        public Node right;

        public Node(T val) {
            this.val = val;
        }
    }

    public static void getPreorderString(final Node node, final StringBuilder stringBuilder) {
        if (node == null) return;
        stringBuilder.append(node.val + " ");
        getPreorderString(node.left, stringBuilder);
        getPreorderString(node.right, stringBuilder);
    }

    public static void printPath(final ArrayList<Node> nodes, final int sum) {
        System.out.println();
        System.out.print("Path with sum " + sum + ": ");
        for (final Node node: nodes) System.out.print(node.val + " ");
    }

    public static ArrayList<Node> copyList(final ArrayList<Node> nodes) {
        final ArrayList<Node> newList = new ArrayList<>();

        if (nodes != null) {
            for(Node node: nodes) {
                final Node newNode = new Node(node.val);
                newList.add(newNode);
                //ignore relations
            }
        }

        return newList;
    }

    public static <T> void pathsWithSum(final int targetSum, int currentSum, final ArrayList<Node> nodesList, final Node currentNode) {
        if (currentNode == null) return;

        nodesList.add(currentNode);
        currentSum+= (int) currentNode.val;

        if (currentSum == targetSum) {
            counter++;
            printPath(nodesList, currentSum);
        }

        // Create list copy and go left and right
        pathsWithSum(targetSum, currentSum, copyList(nodesList), currentNode.left);
        pathsWithSum(targetSum, currentSum, copyList(nodesList), currentNode.right);

        // Go from 0
        pathsWithSum(targetSum, (int) 0, copyList(null), currentNode.left);
        pathsWithSum(targetSum, (int) 0, copyList(null), currentNode.right);
    }

    public static void main(String[] args) {
        // Create a tree
        final Node root = new Node<Integer>(10);
        final Node node5 = new Node<Integer>(5);
        final Node node3 = new Node<Integer>(3);
        final Node node2 = new Node<Integer>(2);
        final Node node3_2 = new Node<Integer>(3);
        final Node nodem2 = new Node<Integer>(-2);
        final Node node1 = new Node<Integer>(1);

        final Node nodem3 = new Node<Integer>(-3);
        final Node node11 = new Node<Integer>(11);

        root.left = node5;
        root.right = nodem3;

        node5.left = node3;
        node5.right = node2;

        node3.left = node3_2;
        node3.right = nodem2;

        node2.right= node1;

        nodem3.right = node11;


        // Print tree preorder
        final StringBuilder stringBuilder = new StringBuilder();
        getPreorderString(root, stringBuilder);

        System.out.println(" Tree preorder: " + stringBuilder);

        System.out.println("PATHS WITH SUM 8");
        pathsWithSum(8, 0, copyList(null), root);

        System.out.println();
        System.out.println("* * *");
        System.out.println("COUNT: " + counter);
    }

}
