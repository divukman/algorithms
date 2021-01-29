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

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        final String input = new Scanner(System.in).nextLine();

        System.out.println("You have entered: " + input);
        System.out.println("--- --- ---");
        System.out.println("Is palindrome: " + Palindrome2.isPalindrome(input));
    }

}
