package com.dimitar.algorithms.codility;

import java.util.HashMap;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 *
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 *
 * For example, in array A such that:
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 *
 *         the elements at indexes 0 and 2 have value 9,
 *         the elements at indexes 1 and 3 have value 3,
 *         the elements at indexes 4 and 6 have value 9,
 *         the element at index 5 has value 7 and is unpaired.
 *
 * Write a function:
 *
 *     class Solution { public int solution(int[] A); }
 *
 *     SOLUTION: https://app.codility.com/demo/results/trainingTQ8CE7-MBX/
 *     Probably not the best, but codility accepts it.
 */
public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        int result = 0;
        final HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            final int no = A[i];
            int counter = hashMap.getOrDefault(no, 0);
            counter++;
            hashMap.put(no, counter);
            //@todo need something smarter here
        }


        for (int i = 0; i < A.length; i++) {
            final int no = A[i];
            int counter = hashMap.getOrDefault(no, 0);
            if (counter % 2 != 0) {
                result = no;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final int [] arr = new int [] { 9, 3, 9, 3, 9, 7, 9 };
        System.out.println("Result: " + solution(arr));
    }
}
