package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class ApplesOranges {

    /**
     * Based on X coordinate in the XY coordinate system. (Or just X here).
     *
     * @param s - house start
     * @param t - house end
     * @param a - apple tree location
     * @param b - orange tree location
     * @param apples -> apple fall locations array, from the tree
     * @param oranges -> orange fall locations array, from the tree
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Get location of fruit on the ground on X coordinate... and calculate right away
        int applesInHouseCounter = 0;
        for (int i = 0; i < apples.length; i++) {
            apples[i] += a;
            if (apples[i] >= s && apples[i] <= t) {
                applesInHouseCounter++;
            }
        }
        int orangesInHouseCounter = 0;
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] += b;
            if (oranges[i] >= s && oranges[i] <= t) {
                orangesInHouseCounter++;
            }
        }

        System.out.println(applesInHouseCounter);
        System.out.println(orangesInHouseCounter);
    }

    public static void main(String[] args) {
        countApplesAndOranges(7, 10, 4, 12, new int[]{2, 3, -4}, new int[] {3, -2, -4}); //1 2
        System.out.println("---------------------------------------------------------------------");
        countApplesAndOranges(7, 11, 5, 15, new int[] {-2, 2, 1}, new int[]{5, -6}); //1 1
    }
}
