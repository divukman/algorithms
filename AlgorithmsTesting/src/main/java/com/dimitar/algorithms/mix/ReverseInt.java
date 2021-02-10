package com.dimitar.algorithms.mix;

public class ReverseInt {

    /**
     * Reverse int
     * current = 0;
     * -----
     *  num % 10 = res
     *  rem
     *  ------
     *
     *  formula: (current * 10) + rem
     * @param num
     * @return reversed num
     */
    public static int reverse(final int num) {
        int result = 0;
        boolean done = false;

        int divideResult = num;
        int reminderResult = 0;

        do {
            int temp = divideResult;
            divideResult = divideResult / 10;
            reminderResult = temp % 10;

            result = (result * 10) + reminderResult;
            done = divideResult == 0;
        } while (!done);


        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
