package com.dimitar.algorithms.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        final HashMap<Integer,Integer> hashMap = new HashMap<>();
        AtomicInteger result = new AtomicInteger();

        for (int i = 0; i <nums.length; i++) {
            int key = nums[i];
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, 1);
            } else {
                int counter = hashMap.get(key);
                counter++;
                hashMap.put(key, counter);
            }
        }

        hashMap.keySet().forEach(key -> {
            int value = hashMap.get(key);
            value--;
            if (value == 1) {
                result.addAndGet(1);
            } else if (value > 1) {
                int pairs = ((1 + value) * value)/2;
                result.addAndGet(pairs);
            }
        });


        return result.get();
    }


    public static int numIdenticalPairs2(int[] nums) {
        int[] dp = new int[101];
        Arrays.fill(dp,-1);
        int good = 0;
        for(int i = 0; i < nums.length; i++){
            dp[nums[i]] = dp[nums[i]] + 1;
            good += dp[nums[i]];
        }
        return good;
    }

    public static void main(String[] args) {

        System.out.println("4? -> " + numIdenticalPairs2(new int[] {1,2,3,1,1,3}));
        System.out.println("6? -> " + numIdenticalPairs2(new int[] {1,1,1,1}));
        System.out.println("0? -> " + numIdenticalPairs2(new int[] {1,2,3}));
    }
}
