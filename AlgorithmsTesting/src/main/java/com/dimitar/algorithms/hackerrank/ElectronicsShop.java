package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop {

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for ( int j = 0; j < drives.length; j++) {
                final int price = keyboards[i] + drives[j];
                if (price <= b && price > max) {
                    max = price;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[] {40, 50, 60}, new int[] {5, 8, 12}, 60));
    }
}
