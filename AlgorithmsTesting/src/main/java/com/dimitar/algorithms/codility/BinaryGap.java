package com.dimitar.algorithms.codility;

// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
// class Solution { public int solution(int N); }

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
 * The number 32 has binary representation 100000 and has no binary gaps.
 */
public class BinaryGap {

    /**
     * Idea is to use bitwise & on the last digit, i.e.
     * 0 & 1 = 0
     * 1 & 1 = 1
     *
     * @param N
     * @return no of zeros in binary representation of a number
     */
    public static int solution(int N) {
        int counter = 0;
        int max = 0;

        while (N > 0) {

            if ((N & 1) == 1) {
                // found one,

                while ((N & 1) == 1 && N != 0) {
                    N>>=1;
                }
                //found zero
                counter=0;
                while ((N & 1) == 0 && N != 0) {
                    N>>=1;
                    counter++;
                }
                if (N==0) {
                    break;
                }
                max = counter > max ? counter : max;
            } else {
                N>>=1;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("9: " + solution(9)); //2
        System.out.println("529: " + solution(529));//4
        System.out.println("15: " + solution(15));//0
    }

}
