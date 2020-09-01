package com.dimitar.algorithms.leetcode;

import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/add-two-numbers/
 *
 * TASK:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode resultNodeRoot = null;
        ListNode resultNode = null;

        int carry = 0;
        ListNode carryOverNode = null;

        while (p1 != null || p2 != null) {
            // Calculate values
            final int val1 = p1 != null ? p1.val : 0;
            final int val2 = p2 != null ? p2.val : 0;
            final int sum = val1 + val2 + carry;

            final int value = sum % 10; // 19 becomes 9, 7 stays 7 etc...
            carry = sum / 10; // 0 or 1

            // Setup nodes
            if (resultNodeRoot == null && resultNode == null) {
                resultNodeRoot = new ListNode(value);
                resultNode = resultNodeRoot;
            } else {
                ListNode newNode = new ListNode(value);
                resultNode.next = newNode;
                resultNode = resultNode.next;
            }

            // Step forward
            p1 = p1!= null && p1.next != null ? p1.next : null;
            p2 = p2!= null && p2.next != null ? p2.next : null;
        }

        if (carry > 0) {
            carryOverNode = new ListNode(1);
            resultNode.next = carryOverNode;
        }

        return resultNodeRoot;
    }
/*

    */

    public static double getNumberFromNode(ListNode node) {
        // 2 -> 4 -> 3
        int step = -1;
        Stack<ListNode> tmpStack = new Stack<>();
        do {
            tmpStack.push(node);
            step++;
            node = node.next;
        } while (node != null);

        double result = 0;

        while (tmpStack.size() > 0) {
            double val = tmpStack.pop().val;
            result += val * Math.pow(10,step--);
        }

        return result;
    }

    public static ListNode getNodeFromNumber(double val) {
        ListNode rootNode = null;
        ListNode node = null;
        double divideVal = (double)val;

        do {
            double divideReminder = divideVal % 10;
            divideVal = divideVal / 10;

            ListNode currentNode = new ListNode((int)divideReminder);
            if (node == null) {
                rootNode = currentNode;
                node = currentNode;
            } else {
                node.next = currentNode;
                node = node.next;
            }
        } while (divideVal >= 1);

        return rootNode;
    }


    public static void main(String[] args) {
        //[1,
        // 0,0
        // ,0,0,
        // 0,0,
        // 0,0,
        // 0,0,

        // 0,0,0,0,0,0,0,0,0,0,
        // 0,0,0,0,0,0,0,0,0,1]
        //[5,6,4]
        final ListNode firstNumber =  new ListNode(1);
        ListNode firstNumberPtr = firstNumber;

        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;

        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;

        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(0);
        firstNumberPtr = firstNumberPtr.next;
        firstNumberPtr.next = new ListNode(1);
        firstNumberPtr = firstNumberPtr.next;


        final ListNode secondNumber =  new ListNode(5);
        ListNode secondNumberPtr = secondNumber;
        secondNumberPtr.next = new ListNode(6);
        secondNumberPtr = secondNumberPtr.next;
        secondNumberPtr.next = new ListNode(4);
        secondNumberPtr = secondNumberPtr.next;

        System.out.println("------------------------------------------");
        ListNode result = addTwoNumbers(firstNumber, secondNumber);
        ListNode printNode = result;
        while (printNode != null) {
            System.out.print(printNode.val +  (printNode.next == null ? "" : " -> " ));
            printNode = printNode.next;
        }
    }
}
