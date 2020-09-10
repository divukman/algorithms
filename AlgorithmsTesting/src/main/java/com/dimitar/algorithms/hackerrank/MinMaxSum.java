package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }

        System.out.print(sum - arr[arr.length-1]);
        System.out.print(" ");
        System.out.println(sum - arr[0]);


    }

    static void miniMaxSum2(int[] arr) {
        long sum = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
        }

        System.out.print(sum - max);
        System.out.print(" ");
        System.out.println(sum - min);


    }

    public static void main(String[] args) {
        miniMaxSum2(new int[] {1, 3, 5, 7, 9});
    }
}
