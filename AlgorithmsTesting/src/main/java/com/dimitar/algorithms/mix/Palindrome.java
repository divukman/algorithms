package com.dimitar.algorithms.mix;

import java.util.Scanner;

/**
 * Check if it is a palindrome.
 *
 */
public class Palindrome {

    public static boolean isPalindrome(final String input) {

        if (input == null || input.length() < 2) {
            return false;
        }

        boolean result = true;

        int first = 0;
        int last = input.length() - 1;

        while (first <= last) {
            final Character firstChar = input.charAt(first);
            final Character lastChar = input.charAt(last);
            if (!firstChar.equals(lastChar)) {
                result = false;
                break;
            }
            first++;
            last--;
        }

        return result;
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check for a palindrome:");
        final String strInput = scanner.nextLine();

        System.out.println("--------------------------");
        System.out.println("Is palindrome: " + isPalindrome(strInput));
    }
}
