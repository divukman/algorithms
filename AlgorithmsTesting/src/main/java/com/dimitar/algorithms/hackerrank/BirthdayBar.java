package com.dimitar.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class BirthdayBar {

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        int counter = 0;
        int sum = 0;
        int pointer = 0;
        int runningLength = 0;
        do {
            sum += s.get(pointer);
            runningLength++;
            if (runningLength % m == 0) {
                if (sum == d) counter++;
                sum-= s.get(pointer - m + 1);
                runningLength--;
            }
            pointer++;
        } while (pointer < s.size());

        result = counter;
        return result;
    }

    public static void main(String[] args) {
       // System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 1, 3, 2})), 3, 2)); //2
       // System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 1, 1, 1, 1, 1})), 3, 2)); //0
        System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(new Integer[] {4})), 4, 1)); //1
    }
}
