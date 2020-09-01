package com.dimitar.algorithms.leetcode;

/**
 * https://leetcode.com/problems/thousand-separator/
 */
public class ThousandSeparator {

    public static String thousandSeparator(int n) {
        final String strVal = String.valueOf(n);

        if (n < 1000) {
            return strVal;
        } else {
            final StringBuilder stringBuilder = new StringBuilder();
            int counter = 0;
            for (int i = strVal.length() - 1; i >= 0; i--) {
                if (counter == 3) {
                    stringBuilder.append(".");
                    counter = 1;
                } else {
                    counter++;
                }
                stringBuilder.append(strVal.charAt(i));
            }
            return stringBuilder.reverse().toString();
        }
    }

    public static void main(String[] args) {
        final int num1 = 987;
        final int num2 = 1234;
        final int num3 = 123456789;
        final int num4 = 0;
        final int num5 = 98988998;

        System.out.println(num1 + ": " + thousandSeparator(num1));
        System.out.println(num2 + ": " + thousandSeparator(num2));
        System.out.println(num3 + ": " + thousandSeparator(num3));
        System.out.println(num4 + ": " + thousandSeparator(num4));
        System.out.println(num5 + ": " + thousandSeparator(num5));
    }
}
