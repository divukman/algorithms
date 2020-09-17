package com.dimitar.algorithms.binarytree;

public class BinaryTree <T extends Comparable<T>> {
    private Node<T> root = null;

    public void insert(T value) {
        root = insertRec(root, value);
    }

    private Node<T> insertRec(Node<T> currentNode, T value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (currentNode.value.compareTo(value) > 0) {
            currentNode.left = insertRec(currentNode.left, value);
        }

        if (currentNode.value.compareTo(value) < 0) {
            currentNode.right = insertRec(currentNode.right, value);
        }

        return currentNode;
    }


    public boolean contains(T value) {
        return containsRec(root,value);
    }

    private boolean containsRec(Node<T> currentNode, T value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value.compareTo(value) > 0) {
            return containsRec(currentNode.left, value);
        }

        if (currentNode.value.compareTo(value) < 0) {
            return containsRec(currentNode.right, value);
        }

        if (currentNode.value.compareTo(value) == 0) {
            return true;
        }

        return false;
    }


    public void delete(T value) {
        root = deleteRec(root, value);
    }

    private T findSmallestValue(Node<T> node) {
        return node.left == null ? node.value : (T) findSmallestValue(node.left);
    }

    private Node<T> deleteRec(Node currentNode, T value) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.value.equals(value)) {
            // delete code

            // If leaf node, or only one child node
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }

            if (currentNode.left == null) {
                return currentNode.right;
            }

            if (currentNode.right == null) {
                return currentNode.left;
            }

            // Two child nodes
            if (currentNode.left != null && currentNode.right != null) {
                T smallestVal = (T) findSmallestValue(currentNode.right);
                currentNode.value = smallestVal;
                currentNode.right = deleteRec(currentNode.right, smallestVal);
                return currentNode;
            }

        } else if (currentNode.value.compareTo(value) > 0) {
            currentNode.left = deleteRec(currentNode.left, value);
        } else {
            currentNode.right = deleteRec(currentNode.right, value);
        }

        return currentNode;
    }

    public void traversePreOrderRoot(StringBuilder stringBuilder) {
        traversePreOrder(root, stringBuilder);
    }

    private void traversePreOrder(Node node, StringBuilder stringBuilder) {
        if (node == null) return;
        stringBuilder.append(node.value);
        traversePreOrder(node.left, stringBuilder);
        traversePreOrder(node.right, stringBuilder);
    }
}
