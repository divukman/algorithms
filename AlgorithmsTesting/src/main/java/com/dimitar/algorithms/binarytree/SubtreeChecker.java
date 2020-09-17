package com.dimitar.algorithms.binarytree;

public class SubtreeChecker {


    public static void main(String[] args) {
        final BinaryTree<Integer> binaryTree1 = new BinaryTree();
        final BinaryTree<Integer> binaryTree2 = new BinaryTree<>();


        binaryTree1.insert(5);
        binaryTree1.insert(3);
        binaryTree1.insert(2);
        binaryTree1.insert(4);
        binaryTree1.insert(7);
        binaryTree1.insert(6);
        binaryTree1.insert(8);


        binaryTree2.insert(7);
        binaryTree2.insert(6);
        binaryTree2.insert(8);


        final StringBuilder stringBuilder1 = new StringBuilder();
        binaryTree1.traversePreOrderRoot(stringBuilder1);

        final StringBuilder stringBuilder2 = new StringBuilder();
        binaryTree2.traversePreOrderRoot(stringBuilder2);

        System.out.println("tree 1: " + stringBuilder1);
        System.out.println("tree 2: " + stringBuilder2);

        System.out.println("tree 2 is a subtree of tree 1: " + stringBuilder1.toString().contains(stringBuilder2.toString()));

    }
}
