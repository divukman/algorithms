package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class DrawingBook {

    public static int pageCount(int n, int p) {
        final int leftHops = p / 2;
        final int totalLeftHops = n / 2;
        final int rightHops = totalLeftHops - leftHops;

        return leftHops < rightHops ? leftHops : rightHops;
    }

    public static void main(String[] args) {
       // System.out.println("5,3 : " + pageCount(5,3)); // 1
       // System.out.println("6,2 : " + pageCount(6,2)); // 1
       // System.out.println("5,4 : " + pageCount(5,4)); // 0
        System.out.println("5,4 : " + pageCount(6,5)); // 1
    }
}
