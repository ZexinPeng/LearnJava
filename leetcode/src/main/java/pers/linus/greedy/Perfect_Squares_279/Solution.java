package pers.linus.greedy.Perfect_Squares_279;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().numSquares(12));
    }
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int j = 1;
            int min = Integer.MAX_VALUE;
            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j] + 1);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
//        int size = (int)Math.sqrt(n);
//        int[] nums = new int[size];
//        for (int i = 0; i < size; i++) {
//            nums[i] = (i + 1) * (i + 1);
//        }
//        // dp[i][j] means to ith in the nums, the minimum account for j
//        int[][] dp = new int[size][n + 1];
//        for (int i = 1; i <= n; i++) {
//            dp[0][i] = i;
//        }
//        for (int i = 1; i < size; i++) {
//            for (int j = 0; j < nums[i]; j++) {
//                dp[i][j] = dp[i - 1][j];
//            }
//            for (int j = nums[i]; j <= n; j++) {
//                dp[i][j] = Math.min(dp[i][j - nums[i]] + 1, dp[i - 1][j]);
//            }
//        }
//        return dp[size - 1][n];
    }
}
