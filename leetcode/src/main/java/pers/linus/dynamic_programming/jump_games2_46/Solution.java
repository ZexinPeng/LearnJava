package pers.linus.dynamic_programming.jump_games2_46;

public class Solution {
    public int jump(int[] nums) {
        // dp[i] represents the minimus number of jumps to the  destination
        int[] dp = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            int minimum = Integer.MAX_VALUE;
            for(int j = nums[i]; j > 0; j--) {
                if (i + j >= nums.length - 1) {
                    dp[i] = 1;
                    minimum = 0;
                    break;
                }
                if (dp[i + j] != Integer.MAX_VALUE) {
                    minimum = Math.min(minimum, dp[i + j]);
                }
            }
            if (minimum == Integer.MAX_VALUE) {
                dp[i] = minimum;
                continue;
            }
            dp[i] = minimum + 1;
        }
        return dp[0];
    }
}
