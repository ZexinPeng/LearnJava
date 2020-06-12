package pers.linus.sleep_wait;

public class Main {
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Thread[] threads = new Thread[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    synchronized (lock) {
                        System.out.println("thread " + Thread.currentThread() + "get lock");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("thread " + Thread.currentThread() + "release lock");
                    }
                }
            });
            threads[i].start();
        }
    }
}
