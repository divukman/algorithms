package com.dimitar.algorithms.mix;

public class Bubble {

    public static int[] bubleSort(final int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] bubleSort2(final int [] arr) {
        int i = 0;
        do {
            int j = 0;
            do {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } while (++j< arr.length - i - 1);
        } while(++i < arr.length - 1);

        return arr;
    }

    public static void main(String[] args) {
        System.out.print("7, 9, 1, 2, 7, 12, 4 : sorted -> ");
        int result[] = bubleSort(new int[] {7, 9, 1, 2, 7, 12, 4});
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        System.out.println();
        System.out.println("---------------------------------------------------");

        System.out.print("7, 9, 1, 2, 7, 12, 4 : sorted -> ");
        result = bubleSort2(new int[] {7, 9, 1, 2, 7, 12, 4});
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        System.out.println();
        System.out.println("---------------------------------------------------");

    }
}
