package pers.linus.heap.topk_fre_692;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<String> heap = new PriorityQueue((a, b)-> {
            if (map.get(a) > map.get(b)) {
                return -1;
            } else if (map.get(a) < map.get(b)) {
                return 1;
            } else {
                return ((String)a).compareTo((String)b);
            }
        });
        for (String str: words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str: map.keySet()) {
            heap.add(str);
        }
        List<String> res = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            res.add(heap.poll());
        }
        return res;
    }

    public static void main(String[] args) {
        new Solution().topKFrequent(new String[]{}, 1);
    }
}
