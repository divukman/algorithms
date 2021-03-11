package com.dimitar.algorithms.mix;

public class Erathostenes {


    private static void printArr(final int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
    }

    @Deprecated
    public static boolean isPrime(final int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result= false;
                break;
            }
        }
        return result;
    }

    private static void removeMultiplesOf(final int num, final int[] arr, final int startIndex) {
        for(int i = startIndex; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] != 1 && arr[i] % num == 0) {
                arr[i] = 0;
            }
        }
    }

    public static void erathostenes(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != 1 &&  arr[i] != 0) {
                removeMultiplesOf(arr[i], arr, i + 1);
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        System.out.println("Starting array:");
        printArr(arr);
        erathostenes(arr);
        System.out.println();
        printArr(arr);
        System.out.println();
    }
}
