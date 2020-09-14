package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 *
 * I am not sure how to go below NxN, but I suspect it is possible...
 * there is, see bucket solution!
 */
public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if ( (ar[i] + ar[j]) % k == 0) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println( divisibleSumPairs(6,5, new int[] {1, 2, 3, 4, 5, 6}));//5
        System.out.println( divisibleSumPairs(6,3, new int[] {1, 3, 2, 6, 1, 2}));//3
    }
}
