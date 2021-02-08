package com.dimitar.algorithms.binarytree;

import junit.framework.TestCase;

public class NewBinaryTreeImplTest extends TestCase {

    public void testInsert() {

        final NewBinaryTreeImpl<Integer, String> newBinaryTree = new NewBinaryTreeImpl<>();

        newBinaryTree.insert(7, "Seven");

        newBinaryTree.insert(5, "Five");
        newBinaryTree.insert(1, "One");
        newBinaryTree.insert(3, "Three");

        newBinaryTree.insert(9, "Nine");
        newBinaryTree.insert(11, "Eleven");
        newBinaryTree.insert(10, "Ten");

        newBinaryTree.printPreOrder();
    }

    public void testDelete() {
        final NewBinaryTreeImpl<Integer, String> newBinaryTree = new NewBinaryTreeImpl<>();

        newBinaryTree.insert(7, "7");

        newBinaryTree.insert(5, "5");
        newBinaryTree.insert(12, "12");

        newBinaryTree.insert(3, "3");
        newBinaryTree.insert(4, "4");

        newBinaryTree.insert(10, "10");
        newBinaryTree.insert(16, "16");
        newBinaryTree.insert(9, "9");
        newBinaryTree.insert(11, "11");


        newBinaryTree.printPreOrder();


        System.out.println("*** *** ***");
        newBinaryTree.delete(5);
        newBinaryTree.printPreOrder();
    }

}