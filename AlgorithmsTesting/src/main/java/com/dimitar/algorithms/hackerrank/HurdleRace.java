package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
        int result = 0;

        // k = min, find max and return diff
        int max = k;
        for (int i = 0; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
            }
        }

        result = max > k ? max - k : result;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(hurdleRace(1, new int [] {1, 2, 3, 3, 2}));
        System.out.println(hurdleRace(4, new int [] {1, 6, 3, 5, 2}));
        System.out.println(hurdleRace(7, new int [] {2, 5, 4, 5, 2}));
    }
}
