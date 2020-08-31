package com.dimitar.algorithms.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * IDEA:
 * - Take a character, if not present, add it
 * - Take next character, if not present, add it
 * ...
 * - If present, delete all characters left of it (start anew), add character
 *
 * ... count max at end
 *
 */
public class LongestSubstringNoRepeat {

    public static int bruteForce(String s) {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        if (s != null && s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {

                for (int j = i; j < s.length(); j++) {
                    stringBuilder.append(s.charAt(j));

                    System.out.println(stringBuilder.toString());

                    // check if characters are unique, if true, count max...
                }
                stringBuilder.setLength(0);
            }
        }

        return result;
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0 || len == 1) {
            return len;
        } else {
            int max = 0;
            List<Character> lstSequence = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                final Character character = s.charAt(i);

                if (lstSequence.size() > 0 && lstSequence.contains(character)) {
                    // we need to clear all characters left of the current character, including current character

                    int index = lstSequence.indexOf(character);
                    lstSequence = lstSequence.subList(index + 1, lstSequence.size());
                }
                lstSequence.add(character);
                max = lstSequence.size() > max ? lstSequence.size() : max;
                System.out.println(lstSequence);
            }

            return max;
        }
    }

    public static void main(String[] args) {
      final String str = "dvdf";//3
        final String str2 = "abcabcbb"; //3
        final String str3 = "bbbbb"; //1*/
        final String str4 = "pwwkew"; //3
        System.out.println(str +": 3? :" + LongestSubstringNoRepeat.lengthOfLongestSubstring(str));
        System.out.println(str2 +": 3? :" + LongestSubstringNoRepeat.lengthOfLongestSubstring(str2));
        System.out.println(str3 +": 1? :" + LongestSubstringNoRepeat.lengthOfLongestSubstring(str3));
        System.out.println(str4 +": 3? :" + LongestSubstringNoRepeat.lengthOfLongestSubstring(str4));
    }
}
