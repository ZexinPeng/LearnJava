package pers.linus.testJAVA;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable{

    private ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap(1000);

    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void run() {
        synchronized (this.map) {
            map.put(atomicInteger.get(), "123");
            atomicInteger.incrementAndGet();
            System.out.println(atomicInteger.get());
        }
    }

    public ConcurrentHashMap getMap() {
        return map;
    }

    public int getInt() {
        return atomicInteger.intValue();
    }
}
