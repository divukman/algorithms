package com.dimitar.algorithms.hackerrank;

import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorials {

    public static BigInteger factorial(int n) {
        if (n == 1) return BigInteger.valueOf(n);
        else {
            return factorial(n-1).multiply(BigInteger.valueOf(n));
        }
    }

    static void extraLongFactorials(int n) {
       final BigInteger result = factorial(n);
        System.out.println(result);
    }


    public static void main(String[] args) {
        extraLongFactorials(30);
    }
}
