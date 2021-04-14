package pers.linus.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static Map<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
    private static AtomicInteger time = new AtomicInteger(0);
    public static void main(String[] args) {
        int num = 0;
        while (num++ < 100) {
            map.put(num, num);
        }
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    if (map.size() > 0) {
                        for (Integer key : map.keySet()) {
                            map.remove(key);
                            time.incrementAndGet();
                            System.out.println(time);
                        }
                    }
                }
            });
            threads[i].start();
        }
    }
}
