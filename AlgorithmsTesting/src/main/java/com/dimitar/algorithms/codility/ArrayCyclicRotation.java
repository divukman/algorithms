package com.dimitar.algorithms.codility;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Write a function:
 *
 *     class Solution { public int[] solution(int[] A, int K); }
 *
 *     RESULTS: https://app.codility.com/demo/results/trainingZXPR4W-FEK/
 */
public class ArrayCyclicRotation {

    public static int[] solution(int[] A, int K) {
        final int[] result = new int[A.length];
        final int N = A.length;

        for (int i = 0; i < N; i++) {
            int temp = i + K;
            if (temp >= N) {
                temp = temp % N;
            }
            result[temp] = A[i];
        }

        return result;
    }


    private static void printArr(final int [] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            final String postfix = i < (arr.length - 1) ? ", " : "";
            System.out.print(arr[i] + postfix);
        }

        System.out.print("] ");
    }

    public static void main(String[] args) {
        final int [] arr1 = new int[] { 3, 8, 9, 7, 6 };
        final int k1 = 3;
       // final int [] expectedRes1 = new int[] { 9, 7, 6, 3, 8 };

        System.out.println("Starting arr: ");
        printArr(arr1);
        System.out.println("K = " + k1);
        System.out.println("Resulting arr: ");
        printArr(solution(arr1, k1));
    }
}
