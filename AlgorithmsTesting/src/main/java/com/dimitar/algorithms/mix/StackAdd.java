package com.dimitar.algorithms.mix;

import java.util.ArrayList;
import java.util.Stack;

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

        do {
            int sum = 0;
            if (ptrA >= 0) {
                sum+= listA.get(ptrA);
                ptrA--;
            }

            if (ptrB >= 0) {
                sum+= listB.get(ptrB);
                ptrB--;
            }

            result.push(sum);
        } while (ptrA >= 0 || ptrB >= 0);


        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        stackA.push(1);
        stackA.push(3);
        stackA.push(4);

        stackB.push(7);
        stackB.push(2);

        Stack<Integer> resultStack = addStacks(stackA, stackB);
        System.out.println("result stack pop");
        while(!resultStack.empty()) {
            System.out.println(resultStack.pop());
        }

    }
}
