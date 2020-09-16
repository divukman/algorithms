package com.dimitar.algorithms.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/longest-common-subsequence/
 * https://www.geeksforgeeks.org/java-program-for-longest-common-subsequence/
 */
public class LongestCommonSubsequenceStr {


    public static String longestCommonSubsequence(String text1, String text2) {
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
            return arr1[m - 1] + lcs(arr1, arr2, m-1, n-1);
        }
        // else we must remove last characters, but which one, we cant tell, branch to two substrings then
        else {
            return max( lcs(arr1, arr2, m - 1, n), lcs(arr1, arr2, m, n - 1)  );
        }
    }

    public static String max(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    public static void main(String[] args) {
        System.out.println( "LCS: abcde, ace => " + longestCommonSubsequence("abcde", "ace"));
    }
}
