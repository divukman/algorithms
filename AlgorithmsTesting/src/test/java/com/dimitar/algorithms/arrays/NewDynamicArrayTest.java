package com.dimitar.algorithms.arrays;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class NewDynamicArrayTest extends TestCase {

    @Test
    public void testAdd() {
        final NewDynamicArray<String> array = new NewDynamicArray<>(3);

        array.add("AAA");
        array.add("BBB");
        array.add("CCC");
        array.add("DDD");
    }

    @Test
    public void testGet() {
        final NewDynamicArray<String> array = new NewDynamicArray<>(10);

        array.add("AAA");
        array.add("BBB");

        Assert.assertEquals("AAA", array.get(0));
        Assert.assertEquals("BBB", array.get(1));
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> array.get(2));
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> array.get(-1));
    }

    @Test
    public void testInsert() {
        final NewDynamicArray<String> array = new NewDynamicArray<>(3);

        array.add("AAA");
        array.add("BBB");
        array.add("CCC");

        array.insert(0, "PRVI");
        array.insert(3, "PREDZADNJI");

        Assert.assertEquals("PRVI", array.get(0));
        Assert.assertEquals("PREDZADNJI", array.get(3));
    }

    @Test
    public void testDelete() {
        final NewDynamicArray<String> array = new NewDynamicArray<>(3);

        array.add("AAA");
        array.add("BBB");
        array.add("CCC");

        array.delete(0);
        Assert.assertEquals("BBB", array.get(0));

        array.delete(1);
        Assert.assertEquals("BBB", array.get(0));

        array.add("FFF");
        array.add("ABAA");
        array.delete(1);
        Assert.assertEquals("ABAA", array.get(1));

    }

    @Test
    public void testIsEmpty() {
        final NewDynamicArray<String> array = new NewDynamicArray<>(3);
        Assert.assertEquals(0, array.size());
    }

    @Test
    public void testContains() {
        final NewDynamicArray<String> array = new NewDynamicArray<>(3);

        array.add("AAA");
        array.add("BBB");
        array.add("CCC");

        Assert.assertTrue(array.Contains("BBB"));
        Assert.assertFalse(array.Contains("BBBADA"));
    }
}