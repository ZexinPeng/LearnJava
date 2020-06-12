package pers.linus.dynamic_programming.house_robber_198;

public class Solution {
    public int rob(int[] nums) {
        //dp[i] 表示到i为止最大的金额
        if (nums.length < 1) {
            return 0;
        }
        else if (nums.length == 1) {
            return nums[0];
        }
        else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        dp[2] = Math.max(nums[0] + nums[2], nums[1]);
        for (int i = 3; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 3] + nums[i - 1]);
        }
        return Math.max(dp[nums.length - 1], dp[nums.length -2]);
    }
}
