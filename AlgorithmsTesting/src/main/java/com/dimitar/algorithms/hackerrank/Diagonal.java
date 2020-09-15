package com.dimitar.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class Diagonal {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int N = arr.size();

        int sumPrimary = 0;
        int sumSecondary = 0;

        for (int i = 0; i < arr.size(); i++) {
            int element = arr.get(i).get(i);
            sumPrimary+=element;

            int element2 = arr.get(N - 1 - i).get(i);
            sumSecondary+=element2;
        }

        return Math.abs(sumPrimary - sumSecondary);

    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);

        arr.add(row1);
        arr.add(row2);
        arr.add(row3);

        System.out.println(diagonalDifference(arr));
    }
}
