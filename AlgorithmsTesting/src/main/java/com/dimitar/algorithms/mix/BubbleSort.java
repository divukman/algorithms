package com.dimitar.algorithms.mix;

public class BubbleSort {

    public static void main(String[] args) {
        final int[] arr = new int[10];

        for (int i = 0; i < arr.length; i ++) {
            arr[i] =  (int) (Math.random() * 1000);
        }

        System.out.println("Original array:");
        System.out.println("--------------------------");
        for (int i = 0; i < arr.length; i ++) {
            System.out.print( arr[i]  + " ");
        }

        // Bubble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
           for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr [j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swapped = true;
                }
           }
           if (!swapped) {
               // Sorted
               System.out.println("sorted");
               break;
           }
        }


        // Print
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
