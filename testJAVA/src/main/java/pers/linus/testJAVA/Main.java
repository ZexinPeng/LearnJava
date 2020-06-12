package pers.linus.testJAVA;

import java.util.Hashtable;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread = new MyThread2();
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(myThread);
            threads[i].start();
        }

        B.test();

        myThread.getClass().getDeclaredAnnotations();

        Thread.sleep(100);
//        for (Object key : map.keySet()) {
//            System.out.println("key:" + key + "  value:"+map.get(key));
//        }
        Hashtable map = myThread.getMap();
        System.out.println(map.size());

    }
}
