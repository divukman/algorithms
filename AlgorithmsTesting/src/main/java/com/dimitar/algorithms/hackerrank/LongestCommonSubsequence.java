package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence/problem
 */
public class LongestCommonSubsequence {

    private static int cache[][][] = null;

    private static int[] lcs (int [] a, int [] b, int m, int n) {
        if (m == 0 || n == 0) return new int[]{};
        else if (a[m-1] == b[n-1]) {
            if (cache[m][n] == null) {
                cache[m][n] = combineArrays( new int[] {a[m-1]}, lcs(a, b, m-1, n-1) );
            }
            return cache[m][n];
        } else {
            // branch
            if (cache[m][n] == null) {
                cache[m][n] =  max( lcs(a, b, m -1, n), lcs(a, b, m, n-1) );
            }
            return cache[m][n];
        }
    }

    private static int[] max(int left[] , int right[]) {
        return left.length > right.length ? left : right;
    }

    private static int[] combineArrays(int left[], int right[]) {
        int result[] = new int[left.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);
        return result;
    }

    // Complete the longestCommonSubsequence function below.
    public static int[] longestCommonSubsequence(int[] a, int[] b) {
        cache = null;
        cache = new int[a.length+1][b.length+1][];
        int reversed[] = lcs(a, b, a.length, b.length);
        int result [] = new int[reversed.length];

        for (int i = reversed.length - 1; i >= 0; i--) {
            result[reversed.length - 1 - i] = reversed[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] seq = longestCommonSubsequence(new int[] {1, 2, 3, 4, 1}, new int[] {3, 4, 1, 2, 1, 3}); // 1 2 3
        for (int i = 0; i < seq.length; i++) {
            System.out.print(seq[i] + " ");
        }
    }
}
