package com.dimitar.algorithms.geeksforgeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * https://practice.geeksforgeeks.org/problems/count-the-triplets/0
 */
public class CountTriplets {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int array[] = new int[N];

            HashMap<Integer, Boolean> hashMap = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                hashMap.put(array[i], Boolean.TRUE);
            }

            int count = 0;
            if (array.length > 3) {

                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i+1; j < array.length; j++) {
                        if (hashMap.containsKey(array[i] + array[j])) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count > 0 ? count: "-1");

        }
    }
}
