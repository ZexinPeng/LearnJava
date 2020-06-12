package pers.linus.dynamic_programming.coin_change_322;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        int minValue = Integer.MAX_VALUE;
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] < 0 || dp[i - coins[j]] == -1) {
                    continue;
                }
                if (dp[i - coins[j]] < minValue) {
                    minValue = dp[i - coins[j]];
                }
            }
            if (minValue != Integer.MAX_VALUE) {
                dp[i] = minValue + 1;
                minValue = Integer.MAX_VALUE;
            }
            else {
                dp[i] = -1;
            }
        }
        return dp[dp.length - 1];
    }
}
