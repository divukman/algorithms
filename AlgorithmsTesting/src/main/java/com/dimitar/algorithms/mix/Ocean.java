package com.dimitar.algorithms.mix;

import java.util.Stack;

/**
 * Consider a list of heights of buildings. The buildings overlook the ocean like so:
 *
 * [2, 3, 4, 2, 3, 1, 1] ~ ocean ~~.
 *
 * Return back, in order, the list of indexes of the buildings that can see the ocean.
 */
public class Ocean {

    public static int[] oceanView(int [] buildings) {
        final Stack<Integer> result = new Stack<>();

        // First row by the ocean sees the ocean, unless windows are facing in opposite direction XD
        int max = buildings[buildings.length-1];
        result.push(max);

        for (int i = buildings.length-2; i>=0; i--) {
            if (buildings[i] > max) {
                max = buildings[i];
                result.push(i);
            }
        }

        int resultArray [] = new int[result.size()];
        int counter = 0;
        while (!result.empty()) resultArray[counter++] = result.pop().intValue();

        return resultArray;
    }

    public static void main(String[] args) {
        int [] result1 = oceanView(new int[] {2, 3, 4, 2, 3, 1, 1});
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
    }
}
