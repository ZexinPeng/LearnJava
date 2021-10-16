package pers.linus.dynamic_programming.best_time_to_buy_and_sell_stock_with_cooldown_309;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        // dp[i][0] represents the maximum ith days not holding a stock, dp[i][1] represents the maximum ith days holding a stock
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[1][1] = Math.max(-prices[1], -prices[0]);
        dp[1][0] = Math.max(0, prices[1] - prices[0]);

        for (int i = 2; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 2][0] - prices[i], dp[i - 1][1]);
        }

        return dp[prices.length - 1][0];
    }
}
