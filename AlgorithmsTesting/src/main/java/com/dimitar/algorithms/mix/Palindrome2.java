package com.dimitar.algorithms.mix;

import java.util.Scanner;

public class Palindrome2 {

    public static boolean isPalindrome(final String str) {
        boolean result = true;

        if (str == null || str.length() < 1) {
            result = false;
        } else {
            int ptrFront = 0;
            int ptrBack = str.length() - 1;

            while (ptrFront <= ptrBack) {
                if (str.charAt(ptrFront) != str.charAt(ptrBack)) {
                    result = false;
                    break;
                }
                ptrFront++;
                ptrBack--;
            }
        }

        return result;
    }



    public static boolean isPalindrome2(final String str) {
        boolean result = true;

        int ptrFront = 0;
        int ptrBack = str.length() - 1;

        while (ptrFront < ptrBack) {
            final Character charFront = str.charAt(ptrFront);
            final Character charBack = str.charAt(ptrBack);
            if (charBack.compareTo(charFront) != 0) {
                result = false;
                break;
            } else {
                ptrFront++;
                ptrBack--;
            }
        }

        return result;
    }

    public static boolean isPalindrome3(final String str) {
        boolean result = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        final String input = new Scanner(System.in).nextLine();

        System.out.println("You have entered: " + input);
        System.out.println("--- --- ---");
        System.out.println("Is palindrome: " + Palindrome2.isPalindrome3(input));
    }

}
