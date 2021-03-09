package com.dimitar.algorithms.stack;

import junit.framework.TestCase;
import org.junit.Assert;

public class StackWithMinTest extends TestCase {

    public void testIsEmpty() {
    }

    public void testPush() {
    }

    public void testPop() {
    }

    public void testMin() {

        final StackWithMin<Integer> stackWithMin = new StackWithMin<>();

        stackWithMin.push(10);
        stackWithMin.push(7);
        stackWithMin.push(23);
        stackWithMin.push(5);
        stackWithMin.push(1);

        Assert.assertEquals(Integer.valueOf(1), stackWithMin.min());
        stackWithMin.pop();

        Assert.assertEquals(Integer.valueOf(5), stackWithMin.min());
        stackWithMin.pop();

        Assert.assertEquals(Integer.valueOf(7), stackWithMin.min());
        stackWithMin.pop();

        Assert.assertEquals(Integer.valueOf(7), stackWithMin.min());
        stackWithMin.pop();

        Assert.assertEquals(Integer.valueOf(10), stackWithMin.min());
        stackWithMin.pop();
    }
}