package com.dimitar.algorithms.mix;

import java.util.HashMap;
import java.util.HashSet;

public class ClassicsRansomNote {

    public static boolean ransomNote(final String note, final String text) {
        boolean result = true;

        final HashMap<Character, Integer> textHashMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            final Character key = text.charAt(i);
            final int currentCount = textHashMap.getOrDefault(key, 0);
            textHashMap.put(key, currentCount + 1);
        }

        // For each note character, check that it exists in the hash and decrease the value of the counter
        for (int i = 0; i < note.length(); i++) {
            final Character key = note.charAt(i);
            int currentCount = textHashMap.getOrDefault(key, 0);
            if (currentCount == 0) {
                result = false;
                break;
            } else {
                currentCount--;
                textHashMap.put(key, currentCount);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(ransomNote("Pay", "Large Payment"));
        System.out.println(ransomNote("Pay", "Lorem ipsum"));
        System.out.println(ransomNote("Pay", "yaP"));
    }
}
