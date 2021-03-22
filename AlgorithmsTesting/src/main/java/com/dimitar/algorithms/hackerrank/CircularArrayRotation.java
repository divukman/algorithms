package com.dimitar.algorithms.hackerrank;


// https://www.hackerrank.com/challenges/circular-array-rotation/problem
public class CircularArrayRotation {


    private static void printArr(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            final String separator = i == arr.length - 1 ? " " : ", ";
            System.out.print(separator);
        }
    }

    public static void rotateArray(final int[] arr) {
        int tmp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = tmp;
    }

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] arr, int k, int[] queries) {
        final int result [] = new int [queries.length];

        for (int i = 0; i < k; i ++) {
            rotateArray(arr);
        }

        for (int i = 0; i < queries.length; i++) {
            result[i] = arr[queries[i]];
        }

        return result;
    }

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotationWithLogic(int[] arr, int k, int[] queries) {
        final int arrLen = arr.length;
        final int result [] = new int [queries.length];

        for (int i = 0; i < queries.length; i++) {
            final int startIndex = queries[i];
            int tmp = (startIndex - k) % arrLen;
            if (tmp < 0) {
                tmp = arrLen + tmp;
            }
            final int newIndex = tmp;
            result[i] = arr[newIndex];
        }

        return result;
    }


    public static void main(String[] args) {
        final int[] arr = new int[] {3, 4, 5};
        final int k = 2;
        final int[] queries = new int[] {1, 2};


        System.out.println("Starting array: ");
        printArr(arr);

        final int [] result = circularArrayRotationWithLogic(arr, k, queries);

        System.out.println();
        System.out.println("Rotated times: " + k);
        System.out.println();
        System.out.println("Result arr: ");
        printArr(result);
    }
}
