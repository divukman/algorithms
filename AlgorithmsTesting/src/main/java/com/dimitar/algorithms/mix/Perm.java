package com.dimitar.algorithms.mix;

import java.util.HashMap;
import java.util.Set;

public class Perm {

    private static void populateHashCounters(final String str, final HashMap<Character, Integer> hashMap) {
        for (int i = 0; i < str.length(); i ++) {
            final Character character = str.charAt(i);
            int counter = hashMap.getOrDefault(character, 0);
            counter++;
            hashMap.put(character, counter);
        }
    }

    private static boolean compareHashCounters(final HashMap<Character, Integer> hashMap1, final HashMap<Character, Integer> hashMap2) {
        final Set<Character> keys = hashMap1.keySet();
        for (Character ch :
                keys) {
            if (hashMap1.getOrDefault(ch, 0) != hashMap2.getOrDefault(ch, 0)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPerm(final String str1, final String str2) {
        boolean result = true;

        // Safety catch
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            result = false;
        } else {
            final HashMap<Character, Integer> str1Hash = new HashMap<>();
            final HashMap<Character, Integer> str2Hash = new HashMap<>();

            Perm.populateHashCounters(str1, str1Hash);
            Perm.populateHashCounters(str2, str2Hash);

            result = Perm.compareHashCounters(str1Hash, str2Hash);
        }

        return result;
    }

    public static void main(String[] args) {
        final String str1 = "thisis1";
        final String str2 = "1thisis";
        final String str3 = "thisiz1";

        System.out.println("Is Permutation: ");
        System.out.println("*** *** *** ***");
        System.out.println("isPermutation ( " + str1 + ", " + str2 + " ) : " + Perm.isPerm(str1, str2));
        System.out.println("isPermutation ( " + str1 + ", " + str3 + " ) : " + Perm.isPerm(str1, str3));
        System.out.println("isPermutation ( " + str2 + ", " + str3 + " ) : " + Perm.isPerm(str2, str3));
        System.out.println("isPermutation ( abc, cab ) : " + Perm.isPerm("abc", "cab"));
        System.out.println("*** *** *** ***");
    }
}
