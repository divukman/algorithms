package com.dimitar.algorithms.queue;

import junit.framework.TestCase;
import org.junit.Assert;

public class MyQueueImplTest extends TestCase {

    public void testAdd() {
        final MyQueueImpl<String> myQueue = new MyQueueImpl<>();

        myQueue.add("A");
        myQueue.add("B");
        myQueue.add("C");
        myQueue.add("D");
        myQueue.add("E");

        myQueue.printQueue();
    }

    public void testRemove() {
        final MyQueueImpl<String> myQueue = new MyQueueImpl<>();

        myQueue.add("A");
        myQueue.add("B");
        myQueue.add("C");
        myQueue.add("D");
        myQueue.add("E");

        final String str = myQueue.remove();
        Assert.assertEquals("A", str);

        myQueue.printQueue();
    }

    public void testIsEmpty() {
        final MyQueueImpl<String> myQueue = new MyQueueImpl<>();
        Assert.assertTrue(myQueue.isEmpty());
        myQueue.printQueue();

        myQueue.add("A");
        myQueue.add("B");

        myQueue.printQueue();

        myQueue.remove();
        Assert.assertFalse(myQueue.isEmpty());

        myQueue.printQueue();
        myQueue.remove();
        Assert.assertTrue(myQueue.isEmpty());

        myQueue.printQueue();
    }
}