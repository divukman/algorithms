package com.dimitar.algorithms.mix;

import java.util.Scanner;

/**
 * Find Factorial of a number using while loop.
 */
public class Factorial {

    public static long factorial(int num) {
        long result = 1;

        int i = 1;
        while (i <= num) {
            result = result * i;
            i++;
        }

        return result;
    }

    public static long factRecursive(int num) {
        if (num == 1) return 1;

        return num * factRecursive(num - 1);
    }

    public static void main(final String args[]) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        final int num = scanner.nextInt();

        System.out.println("----------------------");
        System.out.println("Factorial (while loop): " + factorial(num));
        System.out.println("Factorial (recursion) : " + factorial(num));
    }
}
