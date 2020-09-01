package com.dimitar.algorithms.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    private static HashMap<String, Integer> roman = new HashMap<String, Integer>();
    static {

        roman.put("V", 5);
        roman.put("L", 50);
        roman.put("D", 500);
        roman.put("M", 1000);

        roman.put("I", 1);
        roman.put("IV", 4);
        roman.put("IX", 9);

        roman.put("X", 10);
        roman.put("XL", 40);
        roman.put("XC", 90);

        roman.put("C", 100);
        roman.put("CD", 400);
        roman.put("CM", 900);
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // Regulars
            if (s.charAt(i) == 'V' || s.charAt(i) == 'L' || s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                result += roman.get(String.valueOf(s.charAt(i)));
            }

            // Check specials
            if (s.charAt(i) == 'I') {
               if (i + 1 < s.length()) {
                   if (s.charAt(i+1) =='V' || s.charAt(i+1) =='X') {
                       result += roman.get(String.valueOf(s.charAt(i) + String.valueOf(s.charAt(i+1))));
                       i++;
                       continue;
                   } else {
                       result += roman.get(String.valueOf(s.charAt(i)));
                   }
               } else {
                   result += roman.get(String.valueOf(s.charAt(i)));
               }
            }

            if (s.charAt(i) == 'X') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i+1) =='L' || s.charAt(i+1) =='C') {
                        result += roman.get(String.valueOf(s.charAt(i) + String.valueOf(s.charAt(i+1))));
                        i++;
                        continue;
                    } else {
                        result += roman.get(String.valueOf(s.charAt(i)));
                    }
                } else {
                    result += roman.get(String.valueOf(s.charAt(i)));
                }
            }

            if (s.charAt(i) == 'C') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i+1) =='D' || s.charAt(i+1) =='M') {
                        result += roman.get(String.valueOf(s.charAt(i) + String.valueOf(s.charAt(i+1))));
                        i++;
                        continue;
                    } else {
                        result += roman.get(String.valueOf(s.charAt(i)));
                    }
                } else {
                    result += roman.get(String.valueOf(s.charAt(i)));
                }
            }
        }

        return result;
    }

    public static int romanToInt2(String s) {
        int result = 0;
        Stack<String> stack = new Stack<>();

        int i = 0;
        do {
            Character character = s.charAt(i);
            if ((i+1 < s.length()) && (roman.containsKey(String.valueOf(character) + String.valueOf(s.charAt(i+1))))) {
                stack.push(String.valueOf(String.valueOf(character) + String.valueOf(s.charAt(i+1))));
                i++;
            } else {
                stack.push(String.valueOf(character));
            }
            i++;
            continue;
        } while (i < s.length());

        while (!stack.isEmpty()) {
            result += roman.get(stack.pop());
        }

        return result;
    }

    public static void main(String[] args) {
        final String str1 = "III";
        final String str2 = "IV";
        final String str3 = "IX";
        final String str4 = "LVIII";
        final String str5 = "MCMXCIV";

        System.out.println(str1 + " : " + romanToInt(str1) );
        System.out.println(str2 + " : " + romanToInt(str2) );
        System.out.println(str3 + " : " + romanToInt(str3) );
        System.out.println(str4 + " : " + romanToInt(str4) );
        System.out.println(str5 + " : " + romanToInt(str5) );

        System.out.println("------------------------------------");
        System.out.println(str1 + " : " + romanToInt2(str1) );
        System.out.println(str2 + " : " + romanToInt2(str2) );
        System.out.println(str3 + " : " + romanToInt2(str3) );
        System.out.println(str4 + " : " + romanToInt2(str4) );
        System.out.println(str5 + " : " + romanToInt2(str5) );
    }
}
