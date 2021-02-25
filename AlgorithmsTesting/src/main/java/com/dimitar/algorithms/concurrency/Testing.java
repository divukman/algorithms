package com.dimitar.algorithms.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Testing {

    private static void testRunnalbe() {
        final Runnable task = () -> {
            final String threadName = Thread.currentThread().getName();
            System.out.println("Hello from thread: " + threadName);
            System.out.println("Sleeping...");
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Waking now...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Thread thread = new Thread(task);
        thread.start();
    }

    private static void testExecutor() {
        System.out.println("*** *** ***");
        System.out.println("Executor service...");
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        executorService.shutdown();
        System.out.println("Done...");
    }

    private static void testMultipleCallables() throws InterruptedException {
        final ExecutorService executorService = Executors.newWorkStealingPool();

        final List<Callable<String>> callables  = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3",
                () -> "task4",
                () -> "task5"
        );

        executorService.invokeAll(callables)
                .stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (Exception e) {
                        throw new IllegalStateException();
                    }
                })
                .forEach(System.out::println);

        executorService.shutdown();

    }

    private static void scheduleMultipleCallables() throws InterruptedException {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        ses.scheduleAtFixedRate(() -> {
            try {
                System.out.println("*** " + System.currentTimeMillis());
                testMultipleCallables();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 3, TimeUnit.SECONDS);
    }

    private static void testCallable() throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println("*** *** ***");
        System.out.println("Callable...");
        final Callable<Integer> callable = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return Integer.valueOf(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        final ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        final Future<Integer> future = executorService1.submit(callable);
        System.out.println("future done? " + future.isDone());
        final Integer result = future.get();
        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);
        executorService1.shutdown();
    }

    static int count = 0;
    static synchronized void inc() {count++;}
    private static void testSync() throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0, 1000)
                .forEach(i -> executorService.submit(Testing::inc));

        executorService.shutdown();
        Thread.sleep(1000);
        System.out.println(count);
    }

    private static void atomicSync() throws InterruptedException {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ExecutorService executorService = Executors.newFixedThreadPool(10);
       // atomicInteger.accumulateAndGet()
        IntStream.range(0, 1000)
                .forEach( i -> executorService.submit(atomicInteger::incrementAndGet));

        Thread.sleep(100);
        System.out.println("Waking");

        executorService.shutdown();

        System.out.println(atomicInteger);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        //testMultipleCallables();
        //scheduleMultipleCallables();
        //testSync();

        atomicSync();
    }

}
