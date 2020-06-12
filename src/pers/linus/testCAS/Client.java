package pers.linus.testCAS;

import pers.linus.testvolatile.TestVolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    private static AtomicInteger race = new AtomicInteger(0);

    private static final int THREADS_COUNT = 20;

    private static void increase() {
        race.addAndGet(1);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

        System.out.println(race);
    }
}
