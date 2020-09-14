package com.dimitar.algorithms.mix;

import java.util.Arrays;
import java.util.HashMap;

public class StringPermutationCheck {

    public static boolean isPermutationOf(final String str1, final String str2) {
        // Default to true
        boolean result = true;

        if (str1 == null || str2 == null || str1.length() != str2.length()) return false; // safety check

        final HashMap<Character, Integer> hash1 = new HashMap<>();
        final HashMap<Character, Integer> hash2 = new HashMap<>();

        // Count the characters
        for (int i = 0; i < str1.length(); i++) {
            final Character character1 = str1.charAt(i);
            final Character character2 = str2.charAt(i);

            int count1 = hash1.getOrDefault(character1, 0) + 1;
            int count2 = hash2.getOrDefault(character2, 0) + 1;

            hash1.put(character1, count1);
            hash2.put(character2, count2);
        }

        // Check the counters
        for (int i = 0; i < str1.length(); i++) {
            final Character character1 = str1.charAt(i);
            if (hash1.getOrDefault(character1, 0) != hash2.getOrDefault(character1, 0)) {
                result = false;
                break;
            }
        }

        // Return the result
        return result;
    }

    public static boolean isPermutationOf2(final String str1, final String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false; // safety check
        final char[] array1 = str1.toCharArray();
        final char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String (array1).equalsIgnoreCase(new String(array2));
    }


    public static void main(String[] args) {
        System.out.println("MATE, TEMA: isPermutation: " + isPermutationOf2("MATE", "TEMA"));
        System.out.println("MATE, METEA: isPermutation: " + isPermutationOf2("MATE", "MATEA"));
        System.out.println("MAT2, T2MA: isPermutation: " + isPermutationOf2("MAT2", "T2MA"));
        System.out.println("MAT2, T3MA: isPermutation: " + isPermutationOf2("MAT2", "T3MA"));
        System.out.println("TUTI, FRUTI: isPermutation: " + isPermutationOf2("TUTI", "FRUTI"));
        System.out.println("matemisokovac, kovacmatemiso: isPermutation: " + isPermutationOf2("matemisokovac", "kovacmatemiso"));
    }
}
