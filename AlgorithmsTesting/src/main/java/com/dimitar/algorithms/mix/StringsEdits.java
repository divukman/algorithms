package com.dimitar.algorithms.mix;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

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

        // 1. If string length diff is more than 1 character, its more than one edit away, return false
        if ( Math.abs(str1.length() - str2.length()) > 1) return false;

        final HashMap<Character, Integer> hashMap1 = new HashMap<>();
        final HashMap<Character, Integer> hashMap2= new HashMap<>();
        final HashMap<Character, Integer> hashMapDelta = new HashMap<>();

        buildHashMap(hashMap1, str1);
        buildHashMap(hashMap2, str2);

        // 2. Delta has to be exactly one or zero for one or zero edits away
        final String longerStr = str1.length() > str2.length() ? str1 : str2;
        final String shorterStr = str1.length() <= str2.length() ? str1 : str2;


        for (int i = 0; i < longerStr.length(); i++) {
            final Character key = longerStr.charAt(i);
            final int counter1 = hashMap1.containsKey(key) ? hashMap1.get(key) : 0;
            final int counter2 = hashMap2.containsKey(key) ? hashMap2.get(key) : 0;

            if (!hashMapDelta.containsKey(key)) {
                final int deltaForKey = Math.abs(counter1 - counter2);
                hashMapDelta.put(key, deltaForKey);
            }
        }

        // Now our delta hash map has, for each character, differences between strings
        AtomicInteger diff = new AtomicInteger();
        hashMapDelta.keySet().forEach(key -> {
            diff.addAndGet(hashMapDelta.get(key));
        });

        if (diff.intValue() > 1) {
            return false;
        } else if (diff.intValue() == 1) {
            //Find the diff char
            AtomicReference<Character> diffChar = new AtomicReference<>();
            hashMapDelta.keySet().forEach(key -> {
               int val = hashMapDelta.get(key);
               if (val == 1) {
                   diffChar.set(key);
               }
            });

            final String newLongerStr = longerStr.replace(diffChar.toString(), "");
            return newLongerStr.equals(shorterStr);
        } else if (diff.intValue() == 0) { // palindrome?
            return longerStr.equals(shorterStr);
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println("oneAway(\"pale\", \"paleXXXX\"):   " + oneAway("pale", "paleXXXX"));
        System.out.println("oneAway(\"pale\", \"ple\"):        " + oneAway("pale", "ple"));
        System.out.println("oneAway(\"pales\", \"pale\"):      " + oneAway("pales", "pale"));
        System.out.println("oneAway(\"Mate\", \"Mate\"):       " + oneAway("Mate", "Mate"));
        System.out.println("oneAway(\"miki\", \"kimi\"):       " + oneAway("miki", "kimi"));
        System.out.println("oneAway(\"ABCD\", \"BACDG\"):      " + oneAway("ABCD", "BACDG"));
        System.out.println("oneAway(\"ABCD\", \"ABDC\"):       " + oneAway("ABCD", "ABDC"));
    }
}
