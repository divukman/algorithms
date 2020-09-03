package com.dimitar.algorithms.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class ProgressionFromSequence {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 2) return false;

        Arrays.sort(arr); // O (n log n)

        final int delta1 = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i ++) {
            if ( (arr[i+1] - arr[i]) != delta1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[] {1, 7, 3, 5}));
        System.out.println(canMakeArithmeticProgression(new int[] {1, 2, 4}));
    }
}
