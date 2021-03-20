package pers.linus.hashmap.LRU_Cache_146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {
    HashMap<Integer, Integer> cache;
    List<Integer> keyList;
    int capacity = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer, Integer>();
        keyList = new LinkedList<Integer>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        else {
            keyList.remove(keyList.indexOf(key));
            keyList.add(key);
        }
        return cache.get(key);
    }

    public void put(int key, int value) {
        cache.put(key, value);
        if (keyList.contains(key)) {
            keyList.remove(keyList.indexOf(key));
        }
        keyList.add(key);
        if (cache.size() <= capacity) {
            return;
        }
        cache.remove(keyList.get(0));
        keyList.remove(0);
    }
}
