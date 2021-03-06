package com.dimitar.algorithms.arrays;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DynamicArrayTest extends TestCase {

    public void testGet() {
        final DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        assertEquals(1,1);

        dynamicArray.add("Hello");
        dynamicArray.add("From");
        dynamicArray.add("Array");
        dynamicArray.add("With");
        dynamicArray.add("A");
        dynamicArray.add("Lots");
        dynamicArray.add("Of");
        dynamicArray.add("Strings");

        assertEquals("Hello",dynamicArray.get(0));
        assertEquals("From",dynamicArray.get(1));
        assertEquals("Array",dynamicArray.get(2));

        assertEquals("Strings",dynamicArray.get(7));

        assertNotSame("WrongValue",dynamicArray.get(2));

        log.info("testGet passed :P");
    }

    public void testAdd() {
        final DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        dynamicArray.add("MATE");
        dynamicArray.add("MISO");
        dynamicArray.add("KOVAC");
        dynamicArray.add("ELVIS");
        dynamicArray.add("NEBO");
        dynamicArray.add("SA");
        dynamicArray.add("ZEMLJOM");
        dynamicArray.add("SPOJENO");

        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.print(dynamicArray.get(i) + " ");
        }

        System.out.println("DELETE");
        dynamicArray.delete(0);
        dynamicArray.delete(7);
        dynamicArray.delete(3);
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.print(dynamicArray.get(i) + " ");
        }

    }

    public void testTestGet() {
    }

    public void testSet() {
    }

    public void testInsert() {

    }

    public void testDelete() {
    }

    public void testIsEmpty() {
    }

    public void testContains() {
    }
}