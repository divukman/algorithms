package com.dimitar.algorithms.mix;

import java.util.HashMap;

/**
 * // Challenge: There are three types of edits that can be performed on strings:
 * // insert a character,
 * // remove a character,
 * // replace a character.
 * //
 * // Given two strings, write a function to check if they are
 * // one or zero edits away.
 *         System.out.println(oneAway("pale", "paleXXXX"));
 *         System.out.println(oneAway("pale", "ple"));
 *         System.out.println(oneAway("pales", "pale"));
 *         System.out.println(oneAway("pale", "bale"));
 *         System.out.println(oneAway("pale", "bake"));
 *         System.out.println(oneAway("pale", "aale"));
 */
public class StringsEdits {

    private static void buildHashMap(final HashMap<Character, Integer> hashMap, final String str) {
        for (int i = 0; i < str.length(); i++) {
            final Character key = str.charAt(i);
            int counter = 0;
            if (hashMap.containsKey(key)) {
                counter = hashMap.get(key);
            }
            counter++;
            hashMap.put(key, counter);
        }
    }

    public static boolean oneAway(final String str1, final String str2) {
        boolean result = false;

        final HashMap<Character, Integer> hashMap1 = new HashMap<>();
        final HashMap<Character, Integer> hashMap2= new HashMap<>();

        buildHashMap(hashMap1, str1);
        buildHashMap(hashMap2, str2);

        // Now loop longer string
        final String longerStr = str1.length() > str2.length() ? str1 : str2;
        for (int i = 0; i < longerStr.length(); i++) {
            final Character key = longerStr.charAt(i);
            final int counter1 = hashMap1.containsKey(key) ? hashMap1.get(key) : 0;
            final int counter2 = hashMap2.containsKey(key) ? hashMap2.get(key) : 0;
            final int delta = Math.abs(counter1 - counter2);
            if (delta >= 1) {
                result = true;
                break;
            }
        }

        if (!result) { //throw away palindromes
            result = (str1.length() == str2.length()) && !str1.equals(str2);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "paleXXXX"));
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("Mate", "Mate"));
        System.out.println(oneAway("miki", "kimi"));
    }
}
