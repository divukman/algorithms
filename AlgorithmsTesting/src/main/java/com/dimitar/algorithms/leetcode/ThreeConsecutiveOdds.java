package com.dimitar.algorithms.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/three-consecutive-odds/
 */
public class ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {
        final HashMap<Integer, Boolean> hashMap = new HashMap<>(arr.length);

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0) {
                hashMap.put(i, Boolean.TRUE);

                if (hashMap.containsKey(i-1) && hashMap.containsKey(i-2)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[] { 1,2,34,3,4,5,7,23,12 }));
    }
}
