package com.dimitar.algorithms.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum
 *
 * Idea 2:
 *  -> Brute force, loop twice.
 *
 * Idea 2:
 *  -> Hash map and delta calculation
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j=i+1; j< nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSumHash(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> valIndexHash = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            valIndexHash.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (valIndexHash.containsKey(delta) && valIndexHash.get(delta) != i) {
                result[0] = i;
                result[1] = valIndexHash.get(delta);
                break;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        final int arr[] = new int[] { 2, 3, 4};
        final int target = 6;


        System.out.println("Correct result should be 0, 2");

        System.out.println("twoSum: ");
        int [] result1 = TwoSum.twoSum(arr,target);
        System.out.println("... pairs are: " + result1[0] + ", " +result1[1]);
        System.out.println("---------------------------------------");

        System.out.println("twoSumHash: ");
        int [] result2 = TwoSum.twoSumHash(arr,target);
        System.out.println("... pairs are: " + result2[0] + ", " +result2[1]);
        System.out.println("---------------------------------------");

    }
}
