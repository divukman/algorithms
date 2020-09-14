package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 *
 * ... TLDR
 */
public class BreakingBestWorst {

    public static int[] breakingRecords(int[] scores) {
        final int result[] = new int[2];

        int min = scores[0];
        int max = scores[0];
        int minCounter = 0;
        int maxCounter = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                minCounter++;
                min = scores[i];
            }
            if (scores[i] > max) {
                maxCounter++;
                max = scores[i];
            }
        }

        result[0] = maxCounter;
        result[1] = minCounter;
        return result;
    }

    public static void main(String[] args) {
        int result1[] = breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42});//4 0
        System.out.println(result1[0] + ", " + result1[1]);

        System.out.println("----------------------------------------------------------------");
        int result2[] = breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1});//2 4
        System.out.println(result2[0] + ", " + result2[1]);

    }
}
