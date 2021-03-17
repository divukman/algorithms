package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/cut-the-sticks/problem

/**
 * A bit of a brute force solution.
 * Here is with a bit of logic inside (from RodneyShag's comment):
 *         System.out.println(array.length);
 *         for (int i = 1; i < array.length; i++) {
 *             if (array[i] != array[i-1]) {
 *                 System.out.println(array.length - i);
 *             }
 *         }
 */
public class CutTheSticks {

    public static void printArr(final int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != (arr.length - 1)) System.out.print( ", ");
        }
    }

    private static boolean isCompletedArr(int [] arr) {
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static int getNonNullNumber(int [] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void cutSticks(int [] arr) {
        int smallest = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (smallest == 0) {
                    smallest = arr[i];
                    arr[i] = 0;
                    continue;
                }

                arr[i] -= smallest;
            }

        }
    }

    public static int[] trimZeros(int arr[]) {
        int newSize = getNonNullNumber(arr);
        int [] result = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int [] result = new int[arr.length];

        // Sort it
        Arrays.sort(arr);
        int count = 0;
        while (!isCompletedArr(arr)) {
            result[count] = getNonNullNumber(arr);
            count++;
            cutSticks(arr);
        }
        return  trimZeros(result);
    }


    public static void main(String[] args) {
        final int [] arr = new int[] {5, 4, 4, 2, 2, 8};

        System.out.println("Start array: ");
        printArr(arr);

        int [] result = cutTheSticks(arr);
        System.out.println();
        System.out.println("Result array: ");
        printArr(result);
    }
}
