package pers.linus.back_tracking.PermutationsII_47;

import java.util.*;

public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num: nums) {
            if (numMap.get(num) != null) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }
        backTracking(new LinkedList<>(), numMap, nums.length);
        return res;
    }

    private void backTracking(LinkedList<Integer> list, Map<Integer, Integer> numMap, int size) {
        if (list.size() == size) {
            res.add(new LinkedList<>(list));
            return;
        }
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 0) {
                continue;
            }
            list.addLast(key);
            numMap.put(key, value - 1);
            backTracking(list, numMap, size);
            list.removeLast();
            numMap.put(key, value);
        }
    }
}
