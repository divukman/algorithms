package com.dimitar.algorithms.mix;

import java.util.Stack;

public class StackPlates {

    public static class StackPlatesCustom {
        int threshold = 2;
        final Stack<Stack<Integer>> stackOfStacks = new Stack<>();

        public StackPlatesCustom(final int threshold) {
            this.threshold = threshold;
        }

        void push(Integer element) {
            if (stackOfStacks.isEmpty()) {
                stackOfStacks.push(new Stack<Integer>());
            }

            final Stack<Integer> topStack = stackOfStacks.peek();
            if (topStack.size() >= threshold) {
                stackOfStacks.push(new Stack<Integer>());
            }

            final Stack<Integer> lastTopStack = stackOfStacks.peek();
            lastTopStack.push(element);
        }

        Integer pop() {
            if (stackOfStacks.isEmpty()) {
                return 0;
            }

            Stack<Integer> topStack = stackOfStacks.peek();
            if (topStack.isEmpty() && stackOfStacks.size() > 0) {
                topStack = stackOfStacks.pop();
            }
            int result = topStack.size() > 0 ? topStack.pop() : 0;

            if (topStack.isEmpty()) {
                stackOfStacks.pop();
            }

            return result;
        }
    }


    public static void main(String[] args) {
       final StackPlatesCustom stackPlatesCustom = new StackPlatesCustom(2);

        stackPlatesCustom.push(1);
        stackPlatesCustom.push(2);

        stackPlatesCustom.push(3);
        stackPlatesCustom.push(4);

        stackPlatesCustom.push(5);


        System.out.println(stackPlatesCustom.pop());
        System.out.println(stackPlatesCustom.pop());

        System.out.println(stackPlatesCustom.pop());
        System.out.println(stackPlatesCustom.pop());

        System.out.println(stackPlatesCustom.pop());
        System.out.println(stackPlatesCustom.pop());

    }
}
