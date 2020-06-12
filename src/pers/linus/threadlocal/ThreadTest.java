package pers.linus.threadlocal;

public class ThreadTest extends Thread{
    public ThreadTest() {

    }
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(Thread.currentThread()+":"+i);
        }
    }
    public static void main(String[] args) {
        ThreadTest mThread1 = new ThreadTest();
        ThreadTest mThread2 = new ThreadTest();
        ThreadTest myThread3 = new ThreadTest();
        mThread1.start();
        mThread2.start();
        myThread3.start();
    }
}
