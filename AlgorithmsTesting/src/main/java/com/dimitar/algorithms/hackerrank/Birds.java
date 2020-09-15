package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class Birds {

    public static int migratoryBirds(List<Integer> arr) {
        int counters[] = new int[5];

        for (int i = 0; i < arr.size(); i++) {
            counters[arr.get(i) - 1]++;
        }

        int index = 0;
        for (int i = 1; i < counters.length; i++) {
            if (counters[i] > counters[index]) {
                index = i;
            }
        }

        return index + 1;
    }

    public static void main(String[] args) {

        System.out.println(migratoryBirds( Arrays.asList(new Integer[] {1, 4, 4, 4, 5, 3}) )); // 4
        System.out.println(migratoryBirds( Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4}) )); // 3
    }
}
