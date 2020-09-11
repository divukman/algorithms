package com.dimitar.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 * @todo this is almost a pure brute force, so need more math to figure out the formulas
 */
public class DifferenceBetweenSets {


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int arr1[] = new int[a.size()];
        int arr2[] = new int[b.size()];
        for (int i = 0; i < a.size(); i++) {
            arr1[i] = a.get(i);
        }
        for (int i = 0; i < b.size(); i++) {
            arr2[i] = b.get(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int max1 = arr1[arr1.length-1];
        int min2 = arr2[0];
        List<Integer> possiblities = new ArrayList<>();
        int temp = max1;
        int counter = 1;
        while (temp <= min2) {
            if (areFactorsOfNumber(temp, arr1) && isNumberAFactor(temp,arr2)) {
                possiblities.add(temp);
            }
            counter++;
            temp = max1 * counter;
        }

        for (int i = 0; i < possiblities.size(); i++) {
            System.out.println(possiblities.get(i));
        }

        return possiblities.size();
    }

    public static boolean areFactorsOfNumber(int number, int[]arr) {
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            if (number % arr[i] != 0) {
                result= false;
                break;
            }
        }

        return result;
    }

    public static boolean isNumberAFactor(int number, int[]arr) {
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % number!= 0) {
                result= false;
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
      /*  int res1 = getTotalX(Arrays.asList(new Integer[] {2, 6}), Arrays.asList(new Integer[] {24, 36}));
        System.out.println("res1 = " + res1);

        System.out.println("---------------------------------------------------------------");
        int res2 = getTotalX(Arrays.asList(new Integer[] {2, 4}), Arrays.asList(new Integer[] {16, 32, 96}));
        System.out.println("res1 = " + res2);
*/
        System.out.println("---------------------------------------------------------------");
        int res3 = getTotalX(Arrays.asList(new Integer[] {3, 4}), Arrays.asList(new Integer[] {24, 48}));
        System.out.println("res1 = " + res3);
    }
}
