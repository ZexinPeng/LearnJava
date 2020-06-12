package pers.linus.dynamic_programming.best_time_to_buy_and_sell_stock_with_cooldown_309;

public class Solution {
    public int maxProfit(int[] prices) {
        // dp[i][0]表示第i天未持有股票的最大利润
        // dp[i][1]表示第i天持有股票的最大利润
        int[][] dp = new int[prices.length][2];
        dp[0][1] = Integer.MIN_VALUE;
        dp[0][0] = 0;
        dp[1][0] = 0;
        dp[1][1] = -prices[1];
        for (int i = 2; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 2][0] - prices[i], dp[i - 1][1]);
        }
        return dp[prices.length - 1][0];
    }
}
