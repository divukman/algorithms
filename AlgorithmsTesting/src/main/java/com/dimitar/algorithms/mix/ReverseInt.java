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


    public static int reverse2(final int num) {
        int num2 = Math.abs(num);

        int result = 0;

        int divResult = 0;
        int divReminder = 0;

        int currentNum = num2;
        do {
            divResult = currentNum / 10;
            divReminder = currentNum % 10;
            currentNum = divResult;

            result = (result * 10) + divReminder;
        } while (divResult > 0);

        return num > 0 ? result : result * -1;

    }

    public static void main(String[] args) {
        System.out.println(reverse2(123));
        System.out.println(reverse2(254));
        System.out.println(reverse2(-1123));
    }
}
