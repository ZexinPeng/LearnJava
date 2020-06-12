package pers.linus.threadlocal;

public class Main {

    private static int i = 0;
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadLocal.set(Thread.currentThread() + ":test String" + String.valueOf(i));
                    System.out.println(threadLocal.get());
                }
            });
            threads[i].start();
            threads[i].join();
        }
    }
}
