package pers.linus.back_tracking.Combination_Sum_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> resList = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(new LinkedList<>(), 0, target, candidates);
        return resList;
    }

    private void backTracking(LinkedList<Integer> res, int index, int remain, int[] nums) {
        if (remain == 0) {
            resList.add(new LinkedList<>(res));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            if (remain - nums[i] < 0) {
                break;
            }
            res.add(nums[i]);
            backTracking(res, i + 1, remain - nums[i], nums);
            res.removeLast();
        }
    }
}
