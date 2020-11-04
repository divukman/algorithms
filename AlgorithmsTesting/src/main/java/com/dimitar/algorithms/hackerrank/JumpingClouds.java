package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        if (c.length == 0) return 0;

        int size = c.length;
        int counter = 0;
        int position = 0;

        do {
            if ( (position + 2 <= (size - 1)) && (c[position+2] == 0) ) {
                counter++;
                position += 2;
            } else if ( (position + 1 <= (size - 1)) && (c[position+1] == 0) ) {
                counter++;
                position += 1;
            } else {
                return -1;
            }
        } while ( position < (size - 1) );

        return counter;
    }


    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[] {0, 0, 0, 0, 1, 0}));
    }
}
