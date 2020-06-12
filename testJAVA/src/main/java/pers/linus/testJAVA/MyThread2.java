package pers.linus.testJAVA;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThread2 implements Runnable{

    private Hashtable<Integer, String> map = new Hashtable<Integer, String>(2000);

    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void run() {
        synchronized (this.map) {
            map.put(atomicInteger.get(), "123");
            atomicInteger.incrementAndGet();
        }
            System.out.println(atomicInteger.get());
//        }
    }

    public Hashtable<Integer, String> getMap() {
        return map;
    }

    public int getInt() {
        return atomicInteger.intValue();
    }
}
