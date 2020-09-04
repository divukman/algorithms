package com.dimitar.algorithms.geeksforgeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * https://practice.geeksforgeeks.org/problems/missing-number-in-array/0
 */
public class MissingNumberInArray {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int array[] = new int[N-1];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            if(array[0] != 1) {
                System.out.println(1);
            } else {
                int ptr = 0;
                while(ptr + 1 < array.length) {
                    if (array[ptr+1] - array[ptr] == 2) {
                        System.out.println(array[ptr] + 1);
                        break;
                    }
                    ptr++;
                }
                if (ptr + 1 == array.length) {
                    System.out.println(array[array.length-1] + 1);
                }
            }
        }
    }
}
