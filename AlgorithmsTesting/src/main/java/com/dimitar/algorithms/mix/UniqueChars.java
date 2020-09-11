package com.dimitar.algorithms.mix;

import java.util.HashMap;

public class UniqueChars {

    public static boolean hasUniqueChars(final String str) {
        boolean result = true;

        // We need to count each char
        final HashMap<Character, Integer> hashMap = new HashMap<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            int counter = hashMap.getOrDefault(str.charAt(i), 0);
            if (counter > 0) {
                result = false;
                break;
            }
            counter++;
            hashMap.put(str.charAt(i), counter);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("ABC DEF : " + hasUniqueChars("ABC DEF"));
        System.out.println("ABC ABC : " + hasUniqueChars("ABC ABC"));
        System.out.println("MATEVOLIWHYSK: " + hasUniqueChars("MATEVOLIWHYSK"));
        System.out.println("MATEVOLIWHYSKI: " + hasUniqueChars("MATEVOLIWHYSKI"));
    }
}
