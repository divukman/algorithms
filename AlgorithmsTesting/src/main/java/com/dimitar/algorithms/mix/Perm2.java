package com.dimitar.algorithms.mix;

import java.util.Arrays;

/**
 * Permutation detector.
 */
public class Perm2 {

    public static boolean isPermutation(final String str1, final String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;

        final char[] str1CharArr = str1.toCharArray();
        final char[] str2CharArr = str2.toCharArray();

        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);

        final String sortedStr1 = new String (str1CharArr);
        final String sortedStr2 = new String (str2CharArr);

        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        System.out.println("ABCD is a permutation of DBAC: " + isPermutation("ABCD", "DBAC"));
        System.out.println("ABCD is a permutation of DCCB: " + isPermutation("ABCD", "DCCB"));
    }
}
