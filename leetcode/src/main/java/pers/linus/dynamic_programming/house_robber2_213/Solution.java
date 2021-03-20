package pers.linus.dynamic_programming.house_robber2_213;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(dp(nums, true), dp(nums, false));
    }

    private int dp(int[] nums, boolean overlookFirst) {
        // dp[i] represents the largest amount of money that I can rob
        // at the current place
        int[] dp = new int[nums.length];
        int i = 0;
        int j = 0;
        if (overlookFirst) {
            dp[1] = nums[1];
            dp[2] = Math.max(nums[1], nums[2]);
            i = 3;
            j = nums.length - 1;
        }
        else {
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            i = 2;
            j = nums.length - 2;
        }
        for (; i <= j; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        if (overlookFirst) {
            return dp[nums.length - 1];
        }
        return dp[nums.length - 2];
    }
}
