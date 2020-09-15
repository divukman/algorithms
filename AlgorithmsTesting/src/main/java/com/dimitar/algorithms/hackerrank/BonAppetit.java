package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {

    // Complete the bonAppetit function below.
    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            sum+= i == k ? 0 : bill.get(i);
        }
        int money = sum / 2;

        if (money == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - money);
        }


    }

    public static void main(String[] args) {
        Integer [] arr = new Integer[] {3, 10, 2, 9};
        bonAppetit(Arrays.asList(arr), 1, 7);
    }
}
