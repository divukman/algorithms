package com.dimitar.algorithms.mix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Check if two Strings are Anagrams
 * MATE <=> TEMA <=> META...
 *
 * ... should have the same characters the same number of occurrences, right?
 */
public class Anagram {

    public static boolean isAnagram(final String str1, final String str2) {
        AtomicBoolean result = new AtomicBoolean(true);

        final HashMap<Character, Integer> hashMapStr1 = new HashMap<>(str1.length());
        final HashMap<Character, Integer> hashMapStr2 = new HashMap<>(str2.length());

        createHashMap(str1, hashMapStr1);
        createHashMap(str2, hashMapStr2);

        hashMapStr1.keySet().forEach(character -> {
            int counter1 = hashMapStr1.get(character);
            int counter2 = hashMapStr2.get(character);
            if (counter1 != counter2) {
                result.set(false);
            }
        });

        return result.get();
    }

    private static void createHashMap(String str2, HashMap<Character, Integer> hashMapStr2) {
        str2.chars().forEachOrdered(value -> {
            final Character character = Character.valueOf((char)value);
            int counter = 1;
            if (hashMapStr2.containsKey(character)) {
                counter = hashMapStr2.get(character) + 1;
            }
            hashMapStr2.put(character, counter);
        });
    }


    public static boolean isAnagram2(final String str1, final String str2) {
        boolean result = true;

        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            result = false;
        } else {
            final HashMap<Character, Integer> hash1 = new HashMap<>();
            final HashMap<Character, Integer> hash2 = new HashMap<>();

            for (int i = 0; i < str1.length(); i++) {
                final Character character = str1.charAt(i);
                final int count = hash1.getOrDefault(character, 0);
                hash1.put(character, count + 1);
            }

            for (int i = 0; i < str2.length(); i++) {
                final Character character = str2.charAt(i);
                final int count = hash2.getOrDefault(character, 0);
                hash2.put(character, count + 1);
            }

            // Check the hashes
            for (int i = 0; i < str1.length(); i++) {
                if (hash1.get(str1.charAt(i)) != hash2.get(str1.charAt(i))) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }


    public static boolean isAnagramHack(final String str1, final String str2) {
        boolean result = true;

        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            result = false;
        } else {
            final char[] arr1 = str1.toCharArray();
            final char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            result = Arrays.equals(arr1, arr2);
        }

        return result;
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        final String str1 = scanner.nextLine();

        System.out.println("Enter second string: ");
        final String str2 = scanner.nextLine();

        System.out.println("--------------------------");
        System.out.println("Strings ara anagrams: " + isAnagramHack(str1, str2));
    }
}
