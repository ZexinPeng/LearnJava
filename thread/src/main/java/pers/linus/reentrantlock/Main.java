package pers.linus.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static Lock lock =  new ReentrantLock();
    static int num = 0;
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            public void run() {
                while (num < 1000) {
                    lock.lock();
                    System.out.println(this);
                    System.out.println(num);
                    num++;
                    lock.unlock();
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            public void run() {
                while (num < 1000) {
                    lock.lock();
                    System.out.println(this);
                    System.out.println(num);
                    num++;
                    lock.unlock();
                }
            }
        });
        a.start();
        b.start();
    }
}
