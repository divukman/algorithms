package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset/problem
 */
public class NonDivisableSubset {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
      //@todo
        return 0;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 7, 2, 4};
        System.out.println(nonDivisibleSubset(3, Arrays.asList(arr)));

        Integer[] arr2 = new Integer[] {19, 10, 12, 10, 24, 25, 22};
        System.out.println(nonDivisibleSubset(4, Arrays.asList(arr2)));


        Integer[] arr3 = new Integer[] {278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        System.out.println(nonDivisibleSubset(7, Arrays.asList(arr3)));
    }
}
