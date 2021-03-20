package pers.linus.dynamic_programming.coin_change_322;

import java.util.Arrays;

public class Solution {
//    public int coinChange(int[] coins, int amount) {
//        if (amount == 0) {
//            return 0;
//        }
//        int[] dp = new int[amount + 1];
//        int minValue = Integer.MAX_VALUE;
//        dp[0] = 0;
//        for (int i = 1; i < dp.length; i++) {
//            for (int j = 0; j < coins.length; j++) {
//                if (i - coins[j] < 0 || dp[i - coins[j]] == -1) {
//                    continue;
//                }
//                if (dp[i - coins[j]] < minValue) {
//                    minValue = dp[i - coins[j]];
//                }
//            }
//            if (minValue != Integer.MAX_VALUE) {
//                dp[i] = minValue + 1;
//                minValue = Integer.MAX_VALUE;
//            }
//            else {
//                dp[i] = -1;
//            }
//        }
//        return dp[dp.length - 1];
//    }
    public int coinChange(int[] coins, int amount) {
        // dp[i] represents the fewest amount of coins
        int[] dp = new int[amount + 1];
        for (int i = 1; i < amount + 1; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin == 0) {
                    dp[i] = 1;
                    min = 1;
                }
                else if (i - coin > 0) {
                    if (dp[i - coin] != 0) {
                        min = Math.min(dp[i - coin] + 1, min);
                    }
                }
            }
            if (min != Integer.MAX_VALUE) {
                dp[i] = min;
            }
        }
        if (dp[amount] != 0) {
            return dp[amount];
        }
        return -1;
    }
}
