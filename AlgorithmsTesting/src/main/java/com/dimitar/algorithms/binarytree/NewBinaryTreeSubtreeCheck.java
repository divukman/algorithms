package com.dimitar.algorithms.binarytree;

public class NewBinaryTreeSubtreeCheck {

    public static void main(String[] args) {
        final NewBinaryTree<Integer, String> binaryTree1 = new NewBinaryTreeImpl<>();
        final NewBinaryTree<Integer, String> binaryTree2 = new NewBinaryTreeImpl<>();

        binaryTree1.insert(10, "A");
        binaryTree1.insert(5, "B");
        binaryTree1.insert(1, "C");
        binaryTree1.insert(3, "D");
        binaryTree1.insert(16, "E");

        binaryTree2.insert(5, "B");
        binaryTree2.insert(1, "C");
        binaryTree2.insert(3, "D");

        final StringBuffer stringBuffer1 = new StringBuffer();
        final StringBuffer stringBuffer2 = new StringBuffer();

        ((NewBinaryTreeImpl)binaryTree1).printPreOrder(stringBuffer1);
        ((NewBinaryTreeImpl)binaryTree2).printPreOrder(stringBuffer2);

        System.out.println(stringBuffer1);
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer1.toString().contains(stringBuffer2));

    }
}
