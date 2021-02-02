package com.dimitar.algorithms.mix;

import java.util.HashMap;

public class OneAway {

    public static boolean isOneAway(final String str1, final String str2) {
        boolean result = true;

        final HashMap<Character, Integer> hash1 = new HashMap<>();
        final HashMap<Character, Integer> hash2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            int count = hash1.getOrDefault(str1.charAt(i), 0);
            count++;
            hash1.put(str1.charAt(i), count);
        }

        for (int i = 0; i < str2.length(); i++) {
            int count = hash2.getOrDefault(str2.charAt(i), 0);
            count++;
            hash2.put(str2.charAt(i), count);
        }

        int delta = 0;
        for (int i = 0; i < str1.length(); i++) {
           final Character character = str1.charAt(i);
           delta += Math.abs(hash1.getOrDefault(character, 0 ) - hash2.getOrDefault(character, 0) );
           if (delta > 1) {
               break;
           }
        }

        result = delta <= 1;

        if (result) {
            delta = 0;
            for (int i = 0; i < str2.length(); i++) {
                final Character character = str2.charAt(i);
                delta += Math.abs(hash2.getOrDefault(character, 0 ) - hash1.getOrDefault(character, 0) );
                if (delta > 1) {
                    break;
                }
            }
            result = delta <= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("ple, bble => " + isOneAway("ple","bble") );
        System.out.println("pale, ple => " + isOneAway("pale","ple") );
        System.out.println("pales, pale => " + isOneAway("pales","pale") );
        System.out.println("pales, bale => " + isOneAway("pales","bale") );
        System.out.println("pales, bae => " + isOneAway("pales","bae") );
    }
}
