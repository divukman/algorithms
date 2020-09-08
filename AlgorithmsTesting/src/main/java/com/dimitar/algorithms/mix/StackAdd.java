package com.dimitar.algorithms.mix;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Sum numbers via stack.
 */
public class StackAdd {

    public static Stack<Integer> addStacks(final Stack<Integer> stackA, final Stack<Integer> stackB) {
        Stack<Integer> result = new Stack<>();

        final ArrayList<Integer> listA = new ArrayList<>();
        final ArrayList<Integer> listB = new ArrayList<>();

        while(!stackA.empty()) {
            listA.add(stackA.pop());
        }

        while(!stackB.empty()) {
            listB.add(stackB.pop());
        }

        int ptrA = listA.size() - 1;
        int ptrB = listB.size() - 1;

        int carry = 0;
        do {
            int noA = 0;
            int noB = 0;
            if (ptrA >= 0) {
                noA = listA.get(ptrA);
                ptrA--;
            }

            if (ptrB >= 0) {
                noB = listB.get(ptrB);
                ptrB--;
            }

            int divideResult = (noA + noB + carry) % 10;
            carry = (noA + noB + carry) / 10;

            result.push(divideResult);
        } while (ptrA >= 0 || ptrB >= 0);

        if (carry > 0) {
            result.push(carry);
        }


        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        stackA.push(9);
        stackA.push(9);
        stackA.push(9);

        stackB.push(2);
        stackB.push(2);

        Stack<Integer> resultStack = addStacks(stackA, stackB);
        System.out.println("result stack pop");
        while(!resultStack.empty()) {
            System.out.println(resultStack.pop());
        }

    }
}
