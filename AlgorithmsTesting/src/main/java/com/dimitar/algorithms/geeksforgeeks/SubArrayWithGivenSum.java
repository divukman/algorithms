package com.dimitar.algorithms.geeksforgeeks;

import java.util.Scanner;

/**
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 */
public class SubArrayWithGivenSum {

    // Brute force
/*    public static void main (String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-- > 0) {
            int N = scanner.nextInt();
            int S = scanner.nextInt();

            int array[] = new int[N];
            for (int i = 0; i < N; i ++) {
                array[i] = scanner.nextInt();
            }

            boolean found = false;
            for (int i = 0; i < array.length; i ++) {
                int sum = array[i];

                if (sum == S) {
                    System.out.println( (i + 1) + " " + (i + 1));
                    break;
                }

                int j = i+1;
                while (j < array.length) {
                    sum += array[j];
                    if (sum == S) {
                        System.out.println((i + 1) + " " + (j + 1));
                        found = true;
                        break;
                    } else if (sum > S) {
                        break;
                    }
                    j++;
                }
                if (found) break;
            }
            if (!found) {
                System.out.println("-1");
            }
        }
    }*/

    /**
     * sum each element
     * if sum is greater than S, subtract first, second... until sum is not greater than S
     * check if sum == S, if true, print indexes
     * continue
     *
     * @param args
     */
    public static void main (String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-- > 0) {
            int N = scanner.nextInt();
            int S = scanner.nextInt();

            int array[] = new int[N];
            for (int i = 0; i < N; i ++) {
                array[i] = scanner.nextInt();
            }

            int sum = 0;
            int leftPtr = 0;
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];

                while (sum > S) {
                    sum -= array[leftPtr++];
                }
                if (sum == S) {
                    System.out.println( (leftPtr + 1) + " " + (i + 1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("-1");
            }
        }
    }
}
