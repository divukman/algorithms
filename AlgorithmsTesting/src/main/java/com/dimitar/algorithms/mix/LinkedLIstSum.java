package com.dimitar.algorithms.mix;

import com.dimitar.algorithms.linkedlist.LinkedList;
import com.dimitar.algorithms.linkedlist.LinkedListImpl;

public class LinkedLIstSum {

    public static LinkedList<Integer> sumNumbers(LinkedList<Integer> num1, LinkedList<Integer> num2) {
        LinkedList<Integer> result = new LinkedListImpl<>();

        LinkedListImpl.Node<Integer> node1 = num1.getFirst();
        LinkedListImpl.Node<Integer> node2 = num2.getFirst();
        int carry = 0;

        do {
            Integer val1 = node1 != null ? node1.data : 0;
            Integer val2 = node2 != null ? node2.data : 0;
            int sum = val1 + val2 + carry;
            int tempNum = sum % 10;
            carry = sum / 10;

            result.addBack(tempNum);
            node1 = node1.next;
            node2 = node2.next;
        } while (node1 != null || node2 != null);

        if (carry > 0) {
            result.addBack(carry);
        }

        return result;
    }

    public static void main(String[] args) {

        LinkedList<Integer> num1 = new LinkedListImpl<>();
        num1.addBack(8);
        num1.addBack(2);
        num1.addBack(5);

        LinkedList<Integer> num2 = new LinkedListImpl<>();
        num2.addBack(4);
        num2.addBack(9);
        num2.addBack(2);

        LinkedList<Integer> sum = sumNumbers(num1, num2);

        LinkedListImpl.Node<Integer> node = sum.getFirst();
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }

    }
}
