package com.dimitar.algorithms.mix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class StackPushPopMinO1 {
    public static class CustomStack <T extends Comparable<T>> {
        private Stack<T> stack = new Stack<>();
        private ArrayList<T> min = new ArrayList<>();

        T push(T element) {
            if (min.size() == 0 ||  element.compareTo(min.get(min.size() - 1)) < 0) {
                min.add(element);
            }
            return stack.push(element);
        }

        T pop() {
            final T element = stack.pop();
            min.remove(element);

            return element;
        }

        T min() {
            return min.get(min.size() - 1);
        }
    }

    public static void main(String[] args) {
        final CustomStack<Integer> customStack = new CustomStack<>();

        customStack.push(3);
        customStack.push(7);
        customStack.push(1);
        customStack.push(2);

        System.out.println("MIN: (3) == " + customStack.min());

        customStack.pop();
        customStack.pop();

        System.out.println("MIN: (1) == " + customStack.min());

        customStack.push(0);
        customStack.push(4);
        customStack.push(9);

        System.out.println("MIN: (0) == " + customStack.min());

        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();

        System.out.println("MIN: (3) == " + customStack.min());
    }
}
