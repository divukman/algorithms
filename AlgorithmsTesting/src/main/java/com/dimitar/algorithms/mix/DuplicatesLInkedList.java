package com.dimitar.algorithms.mix;

import java.util.*;

public class DuplicatesLInkedList {

    public static void removeDuplicates(final List<Integer> list) {
        final HashMap<Integer, Integer> counters = new HashMap<>();
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();

            Integer count = counters.getOrDefault(key, 0);
            count = count + 1;
            counters.put(key, count);
        }


        counters.forEach((key, count) -> {
            while (count > 1) {
                count--;
                list.remove(key);
            }
        });
    }


    public static List<Integer> removeDuplicatesHashSet(List<Integer> list) {
        HashSet<Integer> hashSet = new HashSet<>();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            hashSet.add(num);
        }

        List<Integer> uniques = new LinkedList<>();
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            if (hashSet.contains(num)) {
                uniques.add(num);
                hashSet.remove(num);
            }
        }

        return uniques;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(9);

        //removeDuplicates(list);
        list = removeDuplicatesHashSet(list);
        list.forEach(integer -> System.out.println(integer + " "));
    }
}
