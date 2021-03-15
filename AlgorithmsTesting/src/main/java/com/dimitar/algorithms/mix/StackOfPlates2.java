package com.dimitar.algorithms.mix;

import java.util.Stack;

public class StackOfPlates2 {
    private Stack<Stack<Integer>> mainStack = new Stack<>();
    private final int threshold;

    public StackOfPlates2(final int threshold) {
        this.threshold = threshold;
    }

    public void push(final Integer value) {
        if (mainStack.isEmpty() || mainStack.peek().size() >= threshold) {
            final Stack<Integer> newStack = new Stack<>();
            newStack.push(value);
            mainStack.push(newStack);
        } else {
            mainStack.peek().push(value);
        }
    }

    public Integer pop() {
        Integer result = null;

        if (!mainStack.isEmpty()) {
            final Stack<Integer> topStack = mainStack.peek();
            if (!topStack.isEmpty()) {
                result = topStack.pop();
            }
            if (topStack.isEmpty()) {
                mainStack.pop();
            }
        }

        return result;
    }

    public Integer size() {
        return mainStack.size();
    }



    public static void main(String[] args) {

    }
}
