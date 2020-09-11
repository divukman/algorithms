package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class Kangaroo {
    // Complete the kangaroo function below.
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        return (x1 -x2)/(v2 - v1) >= 0 && ((float)(x1 -x2)/(float)(v2 - v1)) %1 == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 2, 5 ,3)); // NO
        System.out.println(kangaroo(0, 3, 4 ,2)); // YES

    }
}
