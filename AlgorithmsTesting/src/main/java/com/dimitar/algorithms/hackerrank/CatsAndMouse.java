package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatsAndMouse {

    public static String catAndMouse(int x, int y, int z) {
        String result = "Cat A";

        final int deltaFromA = Math.abs( z - x );
        final int deltaFromB = Math.abs( z - y );

        if (deltaFromA == deltaFromB) {
            result = "Mouse C";
        } else if (deltaFromA > deltaFromB) {
            result = "Cat B";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(2, 5, 4)); // Cat B
        System.out.println(catAndMouse(1, 2, 3)); // Cat B
        System.out.println(catAndMouse(1, 3, 2)); // Mouse C
    }
}
