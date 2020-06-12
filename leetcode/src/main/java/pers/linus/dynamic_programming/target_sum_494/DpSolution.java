package pers.linus.dynamic_programming.target_sum_494;

public class DpSolution {
    public int findTargetSumWays(int[] nums, int S) {
        if (Math.abs(S) > 1000) {
            return 0;
        }
        int[][] dp = new int[nums.length][2001];
        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (j - nums[i] >= -1000 && j + nums[i] <= 1000) {
                    dp[i][j + 1000] = dp[i - 1][j - nums[i] + 1000] + dp[i - 1][j + nums[i] + 1000];
                }
            }
        }
        return dp[nums.length - 1][S + 1000];
    }
}
