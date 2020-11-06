package com.dimitar.algorithms.hackerrank;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class Movies {

    public static int reverseNumber(int number) {
        Stack<Integer> stack = new Stack<>();

        do {
            int divideResult = number / 10;
            int divideReminder = number % 10;

            stack.push(divideReminder);
            number = divideResult;
        } while (number > 0);


        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
         reversedStack.push(stack.pop());
        }

        int sum = 0;

        while (!reversedStack.isEmpty()) {
            int stackNumber = reversedStack.pop().intValue();
            sum = (sum * 10) + stackNumber;
        }


        

        return sum;
    }

    static int beautifulDays(int i, int j, int k) {
        int result = 0;

        for (int index = i; index <= j; index++) {
            final int num = index;
            final int reversed = reverseNumber(num);
            if (Math.abs(num - reversed) % k == 0) {
                result++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
}
