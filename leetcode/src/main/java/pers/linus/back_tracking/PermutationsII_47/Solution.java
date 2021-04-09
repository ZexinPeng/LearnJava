package pers.linus.back_tracking.PermutationsII_47;

import java.util.*;

public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backTracking(new LinkedList<>(), nums, 0);
        return res;
    }

    private void backTracking(List<Integer> tmpList, int[] nums, int cur) {
        if (cur == nums.length - 1) {
            tmpList.add(nums[cur]);
            res.add(new LinkedList<>(tmpList));
            tmpList.remove(tmpList.size() - 1);
            return;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = cur; i < nums.length; i++) {
            if (set.add(nums[i])) {
                swap(nums, cur, i);
                tmpList.add(nums[cur]);
                backTracking(tmpList, nums, cur + 1);
                tmpList.remove(tmpList.size() - 1);
                swap(nums, cur, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
