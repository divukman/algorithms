/*
package com.dimitar.algorithms.nxlog;


import java.util.concurrent.Flow;

*/
/**
 *  Write modified code which ensures the processor in Executor is always initialized when process() method is executed.
 *
 *  This means make sure the INITIALIZER runs BEFORE EXECUTOR
 *//*

public class SynchroProcessor {
    private Flow.Processor processor;

    public static void main(String[] args) {
        Thread t1 = new Executor();
        Thread t2 = new Initializer();

        // other code

        //When we invoke the join() method on a thread,
        // the calling thread goes into a waiting state. It remains in a waiting state until the referenced thread terminates.

        t2.start(); // start the initializer
        t2.join(); // block until initializer finishes

        t1.start(); // start the processor
        t1.join(0); // wait for processor

        System.exit(0); // return zero as state
    }

    private class Initializer extends Thread {
        public void run() {
            processor = new Flow.Processor();
            processor.init();
        }
    }
    private class Executor extends Thread {
        public void run() {
            processor.process();
        }
    }
}
*/
