package pers.linus.leetcode.set;

import java.util.Hashtable;
import java.util.Map;

public class LearnHashTable {

    private static Map<Integer, String> hashTable = new Hashtable<>();

    public static void main(String[] args) {
        hashTable.put(1, "abc");
        String a = hashTable.put(1, "bcd");
        System.out.println(a);
    }
}
