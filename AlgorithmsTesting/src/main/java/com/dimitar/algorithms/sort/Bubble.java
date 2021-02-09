package com.dimitar.algorithms.sort;

public class Bubble {

    public static void sort(final int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = i - 1;  j >=0; j--) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sort2(final int arr[]) {
        for (int i = 0; i < arr.length - 1; i++ ) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sort3(final int arr[]) {
        for (int i = 0; i < arr.length - 1; i++ ) {
            System.out.print("i: " + i + " j: ");
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] {5, 7, 3, 2, 4 ,8, 9, 1};

        printArr(arr);
        System.out.println();
        System.out.println(" *** *** ***");
        System.out.println("Sorted arr: ");
        sort3(arr);
        printArr(arr);
    }
}
