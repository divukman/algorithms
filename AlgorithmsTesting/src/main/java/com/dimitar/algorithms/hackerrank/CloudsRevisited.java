package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 */
public class CloudsRevisited {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;

        e = e - 1 - (c[0] == 1 ? 2 : 0);

        int index = k;
        while (index < c.length) {
            e = e - 1 - (c[index] == 1 ? 2 : 0);
            index +=k;
            if (index > c.length) {
                index = index % c.length;
            }
        }

        return e;
    }

    public static void main(String[] args) {
       // System.out.println(jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 1, 0} , 2));
        System.out.println(jumpingOnClouds(new int[] {1, 1, 1, 0, 1, 1, 0, 0, 0, 0} , 3));
    }
}
