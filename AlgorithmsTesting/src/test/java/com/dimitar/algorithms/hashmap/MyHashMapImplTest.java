package com.dimitar.algorithms.hashmap;

import junit.framework.TestCase;
import org.junit.Assert;

public class MyHashMapImplTest extends TestCase {

    public void testAdd() {
        final MyHashMapImpl<String, String> myHashMap = new MyHashMapImpl<>();

        myHashMap.add("A", "Hello");
        myHashMap.add("B", "World");
        myHashMap.add("C", "!");
    }

    public void testGet() {
        final MyHashMapImpl<String, String> myHashMap = new MyHashMapImpl<>();

        myHashMap.add("A", "Hello");
        myHashMap.add("B", "World");
        myHashMap.add("C", "!");

        final String val = myHashMap.get("B");
        Assert.assertEquals("World", val);
    }
}