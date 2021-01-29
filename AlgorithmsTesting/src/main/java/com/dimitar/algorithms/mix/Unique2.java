package com.dimitar.algorithms.mix;

import java.util.HashMap;

public class Unique2 {


    /**
     * Check if input string contains all unique chars.
     * @param str - input string
     * @return true if all chars are unique, false otherwise
     */
    public static boolean areUniqeChars(final String str) {
        boolean result = true;

        final HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            final Character character = str.charAt(i);
            Integer counter = hashMap.getOrDefault(character, 0);

            if (counter > 0) {
                result = false;
                break;
            } else {
                counter++;
              hashMap.put(character, counter);
            }
        }


        return result;
    }


    public static void main(String[] args) {
        final String str1 = "this is an input string";
        final String str2 = "ABCDEF1234Q";

        System.out.println("*** *** ***");
        System.out.println("Input string: " + str1);
        System.out.println("Unique: " + areUniqeChars(str1));

        System.out.println("*** *** ***");
        System.out.println("Input string: " + str2);
        System.out.println("Unique: " + areUniqeChars(str2));
    }
}
