package com.dimitar.algorithms.hackerrank;

import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEq {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int [] result = new int[p.length];

        final HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            hashMap.put(p[i], i + 1);
        }

        for (int i = 0; i < p.length; i++) {
            result[i] = hashMap.get(hashMap.get(i + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 5, 2, 1, 3, 4 };

        int [] result = permutationEquation(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
