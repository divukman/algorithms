package com.dimitar.algorithms.leetcode;

/**
 * https://leetcode.com/problems/longest-common-subsequence/
 * https://www.geeksforgeeks.org/java-program-for-longest-common-subsequence/
 */
public class LongestCommonSubsequenceStrMemo {

    private static String[][] cache = null;

    public static String longestCommonSubsequence(String text1, String text2) {
        cache = null;
        cache = new String[text1.length()+1][text2.length()+1];
        String resultReversed = lcs(text1.toCharArray(), text2.toCharArray(), text1.length(), text2.length());
        StringBuilder stringBuilder = new StringBuilder(resultReversed);
        return stringBuilder.reverse().toString();
    }

    public static String lcs (char[] arr1, char [] arr2, int m, int n) {
        // if 'length' of arr1 or arr2 is zero, return zero
        if (m == 0 || n == 0) {
            return "";
        }
        // if last character matches, return 1 + recursion
        else if ( arr1[m - 1] == arr2[n - 1] ) {
            if (cache[m][n] == null || cache[m][n].isEmpty()) {
                cache[m][n] = arr1[m - 1] + lcs(arr1, arr2, m-1, n-1);
            }
            return  cache[m][n];
        }
        // else we must remove last characters, but which one, we cant tell, branch to two substrings then
        else {
            if (cache[m][n] == null || cache[m][n].isEmpty()) {
                cache[m][n] = max( lcs(arr1, arr2, m - 1, n), lcs(arr1, arr2, m, n - 1)  );
            }
            return cache[m][n];
        }
    }

    public static String max(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    public static void main(String[] args) {
        System.out.println( "LCS: abcde, ace => " + longestCommonSubsequence("abcde", "ace"));
    }
}
