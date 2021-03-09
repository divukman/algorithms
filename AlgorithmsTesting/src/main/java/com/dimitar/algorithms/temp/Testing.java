package com.dimitar.algorithms.temp;

public class Testing {

    public static void printArr(final int [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ( i == arr.length -1 ? " " : ", " ) );
    }

    public static void main(String[] args) {
        final int arr[] = { 7, 4, 9, 1, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        printArr(arr);
        System.out.println();
        System.out.println("Sorting....");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                printArr(arr);
                System.out.println();
            }
            System.out.println();
        }
    }
}
