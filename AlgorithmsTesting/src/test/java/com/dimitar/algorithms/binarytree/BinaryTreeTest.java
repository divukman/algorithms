package com.dimitar.algorithms.binarytree;

import junit.framework.TestCase;

public class BinaryTreeTest extends TestCase {

    public void testContains() {
        final BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(Integer.valueOf(5));
        binaryTree.insert(Integer.valueOf(6));
        binaryTree.insert(Integer.valueOf(10));
        binaryTree.insert(Integer.valueOf(3));
        binaryTree.insert(Integer.valueOf(4));
        binaryTree.insert(Integer.valueOf(1));


        assertEquals(binaryTree.contains(Integer.valueOf(3)), true);
        assertEquals(binaryTree.contains(Integer.valueOf(10)), true);
        assertEquals(binaryTree.contains(Integer.valueOf(15)), false);
    }

    public void testDelete() {
        final BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(Integer.valueOf(5));
        binaryTree.insert(Integer.valueOf(6));
        binaryTree.insert(Integer.valueOf(10));
        binaryTree.insert(Integer.valueOf(3));
        binaryTree.insert(Integer.valueOf(4));
        binaryTree.insert(Integer.valueOf(1));

        binaryTree.delete(Integer.valueOf(5));
    }
}