package com.dimitar.algorithms.mix;

import junit.framework.TestCase;

public class StackOfPlates2Test extends TestCase {

    public void testPush() {
        final StackOfPlates2 stackOfPlates2 = new StackOfPlates2(2);

        stackOfPlates2.push(1);
        stackOfPlates2.push(2);
        stackOfPlates2.push(3);
        stackOfPlates2.push(4);
        stackOfPlates2.push(5);

        assertEquals(stackOfPlates2.size(), Integer.valueOf(3));
    }

    public void testPop() {
        final StackOfPlates2 stackOfPlates2 = new StackOfPlates2(2);

        stackOfPlates2.push(1);
        stackOfPlates2.push(2);
        stackOfPlates2.push(3);
        stackOfPlates2.push(4);
        stackOfPlates2.push(5);

        assertEquals(stackOfPlates2.pop(), Integer.valueOf(5));
        assertEquals(stackOfPlates2.size(), Integer.valueOf(2));

        assertEquals(stackOfPlates2.pop(), Integer.valueOf(4));
        assertEquals(stackOfPlates2.pop(), Integer.valueOf(3));
        assertEquals(stackOfPlates2.size(), Integer.valueOf(1));

        assertEquals(stackOfPlates2.pop(), Integer.valueOf(2));
        assertEquals(stackOfPlates2.pop(), Integer.valueOf(1));
        assertEquals(stackOfPlates2.size(), Integer.valueOf(0));
    }
}