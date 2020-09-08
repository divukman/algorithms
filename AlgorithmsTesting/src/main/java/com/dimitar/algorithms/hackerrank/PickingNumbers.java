package com.dimitar.algorithms.hackerrank;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
import static java.util.stream.Collectors.toList;

public class PickingNumbers {
    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        Integer [] arr = new Integer[a.size()];
        a.toArray(arr);
        Arrays.sort(arr);

        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                int delta = Math.abs(arr[j] - arr[i]);
                if (delta <= 1) {
                    count++;
                } else {
                    max = max > count ? max : count;
                    break;
                }
            }
        }

        if (max > 0) {
            max++;
        }
        return max;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = pickingNumbers(a);

        System.out.println(String.valueOf(result));

    }

}