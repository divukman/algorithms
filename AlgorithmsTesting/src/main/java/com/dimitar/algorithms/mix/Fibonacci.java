package com.dimitar.algorithms.mix;

import java.util.Scanner;

/**
 * Write a Java program to print Fibonacci series up to a given number or create simple Java program to calculate Fibonacci number...
 * 1, 1, 2, 3, 5, 8, ...
 *
 * Time difference between loop and a recursion:
 * Enter the limit:
 * 30
 * 0, 1, 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040
 * -----------------------------
 * 0ms
 * Printing with recursion...
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040
 * -----------------------------
 * 16ms
 */
public class Fibonacci {

    public static void printWithLoop(final int limit) {
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + ", ");
        System.out.print(num2 + ", ");

        for (int i = 1; i < limit; i++) {
            int fibNumber = num1 + num2;
            System.out.print(fibNumber + " ");
            num1 = num2;
            num2 = fibNumber;
        }
    }

    private static int fibRecursion(int num) {
       if (num == 0 || num == 1) {
           return num;
       } else {
           return fibRecursion(num - 1) + fibRecursion(num - 2);
       }
    }


    public static void main(final String args[]) {
        final Scanner scanner = new Scanner(System.in);
        int limit;

        System.out.println("Enter the limit: ");
        limit = scanner.nextInt();

        long ts1 = System.currentTimeMillis();
        printWithLoop(limit);
        long ts2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("-----------------------------");
        System.out.print((ts2 - ts1) + "ms");


        System.out.println();
        System.out.println("Printing with recursion...");
        ts1 = System.currentTimeMillis();
        for (int i = 0; i <= limit; i ++) {
            System.out.print(fibRecursion(i) + " ");
        }
        ts2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("-----------------------------");
        System.out.print((ts2 - ts1) + "ms");
    }
}
