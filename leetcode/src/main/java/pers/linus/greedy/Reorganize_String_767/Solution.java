package pers.linus.greedy.Reorganize_String_767;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> queue = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
        for (Character key: map.keySet()) {
            queue.add(key);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char first = queue.poll();
            if (sb.length() > 0 && first == sb.charAt(sb.length() - 1)) {
                if (queue.isEmpty()) {
                    return "";
                }
                char second = queue.poll();
                minus(second, map);
                queue.add(first);
                sb.append(second);
                if (map.containsKey(second)) {
                    queue.add(second);
                }
            } else {
                sb.append(first);
                minus(first, map);
                if (map.containsKey(first)) {
                    queue.add(first);
                }
            }
        }
        return sb.toString();
    }

    private void minus(char ch, HashMap<Character,Integer> map) {
        int times = map.get(ch);
        if (times == 1) {
            map.remove(ch);
        } else {
            map.put(ch, times - 1);
        }
    }
}
