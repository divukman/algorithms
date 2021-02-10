package com.dimitar.algorithms.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class FaceBookArrayIntersector {

    public static ArrayList<Integer> intersect2(int [] array1, int [] array2) {
        final ArrayList<Integer> result = new ArrayList<>();

        // If order is not important
        Arrays.sort(array1);
        Arrays.sort(array2);

        int ptr1 = 0;
        int ptr2 = 0;

        while (ptr1 < array1.length && ptr2 < array2.length) {
            if (array1[ptr1] < array2[ptr2]) {
              ptr1++;
            } else if (array2[ptr2] < array1[ptr1]) {
                ptr2++;
            } else {
                result.add(array1[ptr1]);
                ptr1++;
                ptr2++;
            }
        }

        return result;
    }

    public static ArrayList<Integer> intersect(int [] array1, int [] array2) {
        final HashMap<Integer,Integer> hashMap = new HashMap<>();
        final ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            int counter = hashMap.getOrDefault(array1[i], 0);
            counter++;
            hashMap.put(array1[i], counter);
        }

        for (int i = 0; i < array2.length; i++) {
            int counter = hashMap.getOrDefault(array2[i],0);
            if (counter > 0) {
                result.add(array2[i]);
                counter --;
                hashMap.put(array2[i], counter);
            }
        }

        return result;
    }



    public static void main(String[] args) {
        int [] array1 = {1, 2, 4, 5, 6};
        int [] array2 = {2, 3, 5 ,7};

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);

        ArrayList<Integer> result = intersect2(array1, array2);

        result.forEach(System.out::println);

        System.out.println(result.equals(expected));

    }
}
