package com.dimitar.algorithms.hackerrank;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class SockMerchant {


    public static int sockMerchant(int n, int[] ar) {
        final HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Count, store in hash
        for (int i = 0; i < ar.length; i++) {
            final Integer key = Integer.valueOf(ar[i]);
            final int colorCounter = hashMap.getOrDefault(key, Integer.valueOf(0)) + 1;
            hashMap.put(key, colorCounter);
        }

        // Count / 2 = no of pairs
        AtomicInteger sum = new AtomicInteger();
        hashMap.forEach((integer, integer2) -> sum.addAndGet(integer2 / 2));

        return sum.intValue();
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
