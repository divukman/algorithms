package com.dimitar.algorithms.memoization;

public class Fib {

    final static int mem[] = new int[1001];

    public static int fib(final int num) {
        if (num <= 0) return 0;
        else if (num == 1) return 1;
        else {
            if (mem[num] == 0) {
                mem[num] = fib(num - 1) + fib(num - 2);
            }
            return mem[num];

        }
    }

    public static int fibSlow(final int num) {
        if (num <= 0) return 0;
        else if (num == 1) return 1;
        else {
            return fibSlow(num - 1) + fibSlow(num - 2);
        }
    }



    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int i = 1; i <= 40; i++)
            System.out.print(fib(i) + " ");
        long end1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("DELTA 1: " + (end1 - start1) / 1000);

        long start2 = System.currentTimeMillis();
        for (int i = 1; i <= 40; i++)
            System.out.print(fibSlow(i) + " ");
        long end2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("DELTA 2: " + (end2 - start2) / 1000);

    }

}
