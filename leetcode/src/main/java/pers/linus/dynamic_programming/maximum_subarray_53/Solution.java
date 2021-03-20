package pers.linus.dynamic_programming.maximum_subarray_53;

public class Solution {
//    public int maxSubArray(int[] nums) {
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        int maxValue = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
//            maxValue = dp[i] > maxValue ? dp[i] : maxValue;
//        }
//        return maxValue;
//    }

    public int maxSubArray(int[] nums) {
        // dp[i] represents the largest sum to this place
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
