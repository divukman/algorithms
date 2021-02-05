package com.dimitar.algorithms.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Testing {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("A", "hello A");
        hashMap.put("B", "world B");
        hashMap.put("A", "hello AGAIN");

        final Set<String> keySet = hashMap.keySet();
        keySet.forEach(s -> System.out.println("KEY: " + s + " VAL: " + hashMap.get(s)));
    }
}
