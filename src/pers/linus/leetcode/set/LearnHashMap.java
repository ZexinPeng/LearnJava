package pers.linus.leetcode.set;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    private static Map<Integer, String> hashMap = new HashMap<>();

    public static void main(String[] args) {
        hashMap.put(1, "abc");
        String a = hashMap.put(1, "bcd");
        System.out.println(a);
    }
}
