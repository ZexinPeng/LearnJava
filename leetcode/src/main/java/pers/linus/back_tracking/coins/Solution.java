package pers.linus.back_tracking.coins;

public class Solution {
    public int waysToChange(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        // dp[i][j] represents how many ways to construct amount
        // j to coins[i]
        int[][] dp = new int[4][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < 4; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= n; j++) {
                if(j>=coins[i])
                    dp[i][j]=(dp[i-1][j]+dp[i][j-coins[i]])%1000000007;
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[3][n - 1];
    }
}
