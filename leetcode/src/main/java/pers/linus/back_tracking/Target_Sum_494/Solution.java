package pers.linus.back_tracking.Target_Sum_494;

public class Solution {
    private int res = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backTracking(nums, 0, 0, target);
        return res;
    }

    private void backTracking(int[] nums, int index, int cur, int target) {
        if (index == nums.length) {
            if (cur == target) {
                res++;
            }
            return;
        }
        backTracking(nums, index + 1, cur + nums[index], target);
        backTracking(nums, index + 1, cur - nums[index], target);
    }
}
