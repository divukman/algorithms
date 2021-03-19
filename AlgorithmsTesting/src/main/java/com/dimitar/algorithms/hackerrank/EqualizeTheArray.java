package com.dimitar.algorithms.hackerrank;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem
public class EqualizeTheArray {

    public static void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
            else  System.out.print(" ");
        }
    }

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int result = 0;

        final HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            final int counter = hashMap.getOrDefault(Integer.valueOf(arr[i]), Integer.valueOf(0));
            hashMap.put(Integer.valueOf(arr[i]), counter + 1);
        }

        Collection<Integer> values = hashMap.values();
        List<Integer> lstValues = values.stream().collect(Collectors.toList());



        int max = 0;
        for (int i = 0; i < lstValues.size(); i++) {
            if (max < lstValues.get(i)) {
                max = lstValues.get(i);
            }
        }

        int finalMax = max;
        if(values.stream().filter(integer -> integer != finalMax).count() == 0) {
            return values.size() - 1;
        }

        for (int i = 0; i < lstValues.size(); i++) {
            result+=lstValues.get(i);
        }

        result-=max;

        return result;
    }

    public static void main(String[] args) {

        final int [] arr = new int[] {10, 27, 9, 10, 100, 38, 30, 32, 45, 29, 27, 29, 32, 38, 32, 38, 14, 38, 29, 30, 63, 29, 63, 91, 54, 10, 63};
        final int [] arr2 = new int[] {1, 2, 3, 1, 2, 3, 3, 3};

        Arrays.sort(arr);

        printArr(arr);
        System.out.println();
        System.out.println("---");
        System.out.println("No of elements: " + equalizeArray(arr));

     /*   printArr(arr2);
        System.out.println();
        System.out.println("---");
        System.out.println("No of elements: " + equalizeArray(arr2));*/
    }

}
