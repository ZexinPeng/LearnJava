package pers.linus.back_tracking.subsets_78;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    // key代表数的值, value代表数字在nums中的索引
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> tmp = new LinkedList<Integer>();
            tmp.add(nums[i]);
            result.add(tmp);
            map.put(nums[i], i);
        }
        int first = 0, end = nums.length - 1;
        for (int i = 1; i < nums.length; i++) {
            int tmp = end;
            end = backTrack(first, end, nums);
            first = tmp + 1;
        }
        result.add(new LinkedList<Integer>());
        return result;
    }

    private int backTrack(int first, int end, int[] nums) {
        int lastIndex = 0;
        for (int i = first; i <= end; i++) {
            List<Integer> tmp = result.get(i);
            for (int j = map.get(tmp.get(tmp.size() - 1)) + 1; j < nums.length; j++) {
                List<Integer> tmpList = new LinkedList<Integer>(result.get(i));
                lastIndex++;
                tmpList.add(nums[j]);
                result.add(tmpList);
            }
        }
        return lastIndex + end;
    }
}
