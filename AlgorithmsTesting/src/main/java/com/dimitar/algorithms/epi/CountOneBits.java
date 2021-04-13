package com.dimitar.algorithms.epi;
// pg 25
// help: https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
public class CountOneBits {

    public static int countOneBits(int n) {
        int count = 0;

        while (n > 0) {
            count += n & 1; //get last bit, 0 or 1
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 9;
        System.out.println(countOneBits(a));
    }
}
