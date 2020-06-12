package pers.linus.dynamic_programming.perfect_squares_279;

public class Solution {
    public int numSquares(int n) {
        //dp[i]代表组成i最少的平方和数
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i - Math.pow((int) Math.sqrt(i), 2) == 0) {
                dp[i] = 1;
                continue;
            }
            int minValue = dp[i - (int) Math.pow((int) Math.sqrt(i), 2)];
            for (int j = (int) Math.sqrt(i) - 1; j > 0; j--) {
                if (dp[i - j * j] < minValue) {
                    minValue = dp[i - j * j];
                }
            }
            dp[i] = minValue + 1;
        }
        return dp[n];
    }
}
