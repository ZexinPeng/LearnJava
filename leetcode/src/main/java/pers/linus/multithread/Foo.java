package pers.linus.multithread;

import java.util.concurrent.atomic.AtomicInteger;

class Foo {
    private volatile boolean firstFinished = false;
    private volatile boolean secondeFinished = false;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstFinished = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!firstFinished) {
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondeFinished = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!secondeFinished) {
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
