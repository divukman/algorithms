package com.dimitar.algorithms.mix;

public class FibMemoization {

    public static int fib(int n) {
        if (n == 0 || n == 1) return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static int array[] = new int[1000];

    public static int fibMemo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (array[n] == 0) {
            array[n] = fibMemo(n - 1) + fibMemo(n - 2);
        }
        return array[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 40; i ++) {
            long start = System.currentTimeMillis();
            System.out.println("FIB: " + i + ": "+ fib(i) + " | " + (System.currentTimeMillis() - start) + " ms");
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < 40; i ++) {
            long start = System.currentTimeMillis();
            System.out.println("FIB MEMO: " + i + ": "+ fibMemo(i) + " | " + (System.currentTimeMillis() - start) + " ms");
        }
    }
}
