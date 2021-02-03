package com.dimitar.algorithms.mix;

import com.dimitar.algorithms.linkedlist.NewLinkedListImpl;

import java.util.Stack;

public class SumLists {

    public static void main(String[] args) {

        final Stack<Integer> no1 = new Stack<>();
        final Stack<Integer> no2 = new Stack<>();
        final Stack<Integer> result = new Stack<>();

        // first number, 528
        no1.push(5);
        no1.push(2);
        no1.push(8);

        // second number, 294
        no2.push(2);
        no2.push(9);
        no2.push(4);

        int carry = 0;
        while (!no1.isEmpty() || !no2.isEmpty()) {
            int digit1 = no1.isEmpty() ? 0 : no1.pop();
            int digit2 = no2.isEmpty() ? 0 : no2.pop();
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int resultDigit = sum % 10;
            result.push(resultDigit);
        }
        if (carry != 0) {
            result.push(carry);
        }

        System.out.println("Result: ");
        while (!result.isEmpty()) System.out.println(" -> " + result.pop());
    }
}
