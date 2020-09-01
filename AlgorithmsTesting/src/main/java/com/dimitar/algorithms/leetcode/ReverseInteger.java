package com.dimitar.algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public static int reverse(int x) {
        long result = 0;
        long divideResult = Math.abs((long)x);
        long divideResultTmp = 0;
        List<Integer> lstDigits = new ArrayList<>();

        // Get the digits
        do {
            divideResultTmp = divideResult / 10;
            int divideReminder = (int)(divideResult % 10);

            lstDigits.add(divideReminder);

            divideResult = divideResultTmp;
        } while(divideResult > 0);

        // Construct a new integer
        int exp = lstDigits.size() - 1;
        for(int i = 0; i < lstDigits.size(); i++) {
            result += lstDigits.get(i) * Math.pow(10, exp--);
        }

        if (x < 0) {
            result = result * -1;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }

        return (int)result;
    }

    static int reverse2(int x) {
        long result = 0;

        boolean condition = false;
        long divideResult =  Math.abs((long)x);

        do {
            long divideResultTmp = divideResult / 10;
            int divideReminder = (int)(divideResult % 10);
            divideResult = divideResultTmp;

            result = (result * 10) + divideReminder;

            condition =divideResult > 0;
        } while(condition);

        result = x > 0 ? result : -result;
        result = (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : result;

        return (int) result;
    }

    public static void main(String[] args) {
        final int val1 = -2147483648
                ;

        System.out.println(val1 + " reversed: " + reverse(val1));
        System.out.println(val1 + " reversed: " + reverse2(val1));
    }
}
