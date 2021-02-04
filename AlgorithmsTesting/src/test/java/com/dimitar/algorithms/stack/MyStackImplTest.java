package com.dimitar.algorithms.stack;

import junit.framework.TestCase;
import org.junit.Assert;

public class MyStackImplTest extends TestCase {

    public void testIsEmpty() {
        final MyStack<String> myStack = new MyStackImpl<>();

        Assert.assertTrue(myStack.isEmpty());
        myStack.push("A");
        Assert.assertFalse(myStack.isEmpty());
    }

    public void testPush() {
        final MyStack<String> myStack = new MyStackImpl<>();

        myStack.push("A");
        Assert.assertEquals("A", myStack.pop());
    }

    public void testPop() {
        final MyStack<String> myStack = new MyStackImpl<>();

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        myStack.push("E");
        myStack.push("F");

        ((MyStackImpl) myStack).printStack();

        Assert.assertEquals("F", myStack.pop());
    }
}