package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 *
 * Whomever figured out this text, should work in porn industry to make up stories.
 * What child has 10^5 years!?! an ELF?
 */
public class BirthdayCake {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < candles.size(); i++) {
            int key = candles.get(i);
            int counter = hashMap.getOrDefault(candles.get(i),0) + 1;
            hashMap.put(key, counter);
            if (counter > max) {
                max = counter;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(new Integer[] {3, 2, 1, 3})));
    }
}
