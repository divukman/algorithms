package com.dimitar.algorithms.mix;

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

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        final String str1 = scanner.nextLine();

        System.out.println("Enter second string: ");
        final String str2 = scanner.nextLine();

        System.out.println("--------------------------");
        System.out.println("Strings ara anagrams: " + isAnagram(str1, str2));
    }
}
