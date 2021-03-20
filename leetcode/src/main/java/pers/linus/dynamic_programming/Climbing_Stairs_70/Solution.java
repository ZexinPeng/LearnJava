package pers.linus.dynamic_programming.Climbing_Stairs_70;

public class Solution {
    public int climbStairs(int n) {
        // dp[i] represents the largest ways to the current step
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2]) + 1;
        }
        return dp[n];
    }
}
