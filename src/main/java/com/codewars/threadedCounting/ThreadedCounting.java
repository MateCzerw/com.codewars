package com.codewars.threadedCounting;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadedCounting {
    public static void countInThreads(Counter counter) {

        ExecutorService[] execs = new ExecutorService[3];
        for (int i = 0; i < 3; i++) {
            execs[i] = Executors.newFixedThreadPool(1);
        }

        try {
            for (int i = 1; i <= 100; i++) {
                int n = i;
                Runnable task = () -> counter.count(n);
                execs[n % 3].submit(task).get();
            }

            for (int i = 0; i < 3; i++) {
                execs[i].shutdown();
                execs[i].awaitTermination(1, TimeUnit.SECONDS);
            }
        }
        catch (InterruptedException| ExecutionException e) {
            throw new Error("can't happen", e);
        }
    }
}


