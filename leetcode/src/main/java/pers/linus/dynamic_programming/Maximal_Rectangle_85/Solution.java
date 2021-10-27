package pers.linus.dynamic_programming.Maximal_Rectangle_85;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        // dp[i][j] represents the maximum area from [0, 0]
        // to row i and column j
        int[][] dp = new int[matrix.length][matrix[0].length];
        if (matrix[0][0] == '1') {
            dp[0][0] = 1;
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1') {
                dp[0][i] = Math.max(1, dp[0][i - 1] + 1);
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == '1') {
                dp[i][0] = Math.max(1, dp[i - 1][0] + 1);
            }
        }
        return dp[matrix.length - 1][matrix[0].length - 1];
    }
}
