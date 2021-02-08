package com.dimitar.algorithms.binarytree;


public class NewBinaryTreeImpl <K extends Comparable<K>, V> implements NewBinaryTree <K, V> {

    private class Node <K extends Comparable<K>, V> {
        public K key;
        public V value;

        public Node left = null;
        public Node right = null;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root = null;


    @Override
    public void insert(K key, V value) {
        root = insert(root, key, value);
    }

    private Node insert(final Node<K, V> root, final K key, final V value) {
        if (root == null) {
            return new Node(key, value);
        } else if ( root.key.compareTo(key) > 0) {
            root.left = insert(root.left, key, value);
        } else if (root.key.compareTo(key) < 0) {
            root.right = insert(root.right, key, value);
        }

        return root;
    }

    @Override
    public void delete(K key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node node, final K key) {
      if (node == null) {
          return null;
      }

      if (node.key.compareTo(key) == 0) {
          if (node.left == null && node.right == null) {
              return null;
          } else if (node.right == null) {
              return node.left;
          } else if (node.left == null) {
              return node.right;
          } else {
              node = min(node.right);
              node.right = deleteRec(node.right, key);
              return node;
          }
      } else if (node.key.compareTo(key) > 0) {
          node.left = deleteRec(node.left, key);
      } else if (node.key.compareTo(key) < 0) {
          node.right = deleteRec(node.right, key);
      }

      return node;
    }

    public Node min (final Node node) {
        if (node == null || node.left == null) return node;
        else return min(node.left);
    }

    public void printPreOrder() {
        printPreOrderTraversal(root);
    }

    // Root, left, right => for copying
    private void printPreOrderTraversal(final Node node) {
        if (node != null) {
            System.out.println(node.key);
            printPreOrderTraversal(node.left);
            printPreOrderTraversal(node.right);
        }
    }


    public void printPreOrder(StringBuffer stringBuffer) {
        printPreOrderTraversal(root, stringBuffer);
    }

    public void printPreOrderTraversal(final Node node, StringBuffer stringBuffer) {
        if (node != null) {
            stringBuffer.append(node.key); stringBuffer.append(" ");
            printPreOrderTraversal(node.left, stringBuffer);
            printPreOrderTraversal(node.right, stringBuffer);
        }
    }
}
