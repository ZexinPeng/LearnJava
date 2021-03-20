package pers.linus.multithread.Print_in_Order_1114;

public class Foo {
    int num = 0;
    Object lock = new Object();
    public Foo() {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        if (num % 3 == 0) {
                            System.out.println('A');
                            num++;
                            lock.notifyAll();
                        }
                        else {
                            try {
                                lock.notify();
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        if (num % 3 == 1) {
                            System.out.println('B');
                            num++;
                            lock.notifyAll();
                        }
                        else {
                            try {
                                lock.notify();
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lock) {
                        if (num % 3 == 2) {
                            System.out.println('C');
                            num++;
                            lock.notifyAll();
                        }
                        else {
                            try {
                                lock.notify();
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        a.start();
        b.start();
        c.start();
    }
}
