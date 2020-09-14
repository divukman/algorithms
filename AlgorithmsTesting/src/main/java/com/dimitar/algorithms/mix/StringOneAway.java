package com.dimitar.algorithms.mix;

import java.util.HashMap;

public class StringOneAway {


    public static boolean oneAway(final String str1, final String str2) {
        boolean result = false;

        // Safety catches
        if (str1 == null || str2 == null) return false;
        if (str1.length() == str2.length()) return str1.equalsIgnoreCase(str2);
        if ( Math.abs(str1.length() - str2.length()) > 1) return false;

        // Find the extra character
        final HashMap<Character, Integer> hashLonger = new HashMap<>();
        final HashMap<Character, Integer> hashShorter = new HashMap<>();


        final String longerString = str1.length() > str2.length() ? str1 : str2;
        final String shorterString = str1.length() < str2.length() ? str1 : str2;

        //Count chars
        for (int i = 0; i < longerString.length(); i++) {
            int counter = hashLonger.getOrDefault(longerString.charAt(i), 0) + 1;
            hashLonger.put(longerString.charAt(i), counter);
        }

        for (int i = 0; i < shorterString.length(); i++) {
            int counter = hashShorter.getOrDefault(shorterString.charAt(i), 0) + 1;
            hashShorter.put(shorterString.charAt(i), counter);
        }

        // Where diff is 1, we have our character
        int delta = 0;
        for (int i = 0; i < longerString.length(); i++) {
            Character character = longerString.charAt(i);
            delta += Math.abs(hashLonger.getOrDefault(character,0) - hashShorter.getOrDefault(character, 0));
        }

        if (delta == 1) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("pale, ple: " + oneAway("pale", "ple"));
        System.out.println("pale, plB: " + oneAway("pale", "plB"));
        System.out.println("pales, pale: " + oneAway("pales", "pale"));
        System.out.println("pales, beerd: " + oneAway("pales", "beerd"));
    }
}
