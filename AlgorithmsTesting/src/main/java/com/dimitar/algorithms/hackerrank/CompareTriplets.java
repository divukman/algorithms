package com.dimitar.algorithms.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        final List<Integer> result = new ArrayList<>(2);

        if (a.size() != b.size()) return null; //should not happen if TC is correct

        int aliceTotalScore = 0;
        int bobTotalScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceTotalScore++;
            } else if (a.get(i) < b.get(i)) {
                bobTotalScore++;
            }
        }

        result.add(aliceTotalScore);
        result.add(bobTotalScore);

        return result;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> result = compareTriplets(Arrays.asList(new Integer[]{5, 6, 7}), Arrays.asList(new Integer[]{3, 6, 10}));
        result.stream().forEach(integer -> {
            System.out.print(integer + " ");
        });

    }
}
