package com.dimitar.algorithms.mix;

import java.util.Scanner;

/**
 * Write a program on prime number.
 *
 * Number: 2
 * Number: 3
 * Number: 5
 * Number: 7
 * Number: 11
 * Number: 13
 * Number: 17
 * Number: 19
 * Number: 23
 * Number: 29
 * Number: 31 ...
 */
public class Prime {

    public static boolean isPrime(final int num) {
        final int half = num / 2;
        boolean result = true;

        for (int i = 2; i <= half; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit:");
        int limit = scanner.nextInt();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println("Number: " + i);
            }

        }
    }

}
