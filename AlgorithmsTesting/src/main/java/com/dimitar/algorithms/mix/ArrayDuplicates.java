package com.dimitar.algorithms.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *  Java Program to removed duplicates from ArrayList
 */
public class ArrayDuplicates {

    public static void main(final String[] args) {
        List<Integer> list = new ArrayList<>(10);

        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(7);
        list.add(10);
        list.add(9);

        System.out.println("Original list");
        list.forEach(element -> System.out.print(element + " "));

        // Lets count the duplicates
        final HashMap<Integer, Integer> hashMap = new HashMap<>(10);


        //Ah just cheat with something simple
        List<Integer> newArrayList = new ArrayList<>(10);
        list.forEach(integer -> {
            if (!newArrayList.contains(integer)) {
                newArrayList.add(integer);
            }

            int val = 1;
            if (hashMap.containsKey(integer)) {
                val = hashMap.get(integer) + 1;
            }
            hashMap.put(integer, val);
        });

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Elements: ");
        hashMap.keySet().forEach(integer -> {
            System.out.println(integer + ": " + hashMap.get(integer) + " times");
        });

        System.out.println("---------------------------");

        list = newArrayList;
        System.out.println("Filtered list");
        list.forEach(element -> System.out.print(element + " "));
    }
}
