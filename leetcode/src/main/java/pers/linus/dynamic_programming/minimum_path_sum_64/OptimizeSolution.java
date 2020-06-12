package pers.linus.dynamic_programming.minimum_path_sum_64;

public class OptimizeSolution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[] dp = new int[column];
        dp[0] = grid[0][0];
        for (int i = 1; i < column; i++) {
            dp[i] = grid[0][i] + dp[i - 1];
        }
        for (int i = 1; i < row; i++) {
            dp[0] = dp[0] + grid[i][0];
            for (int j = 1; j < column; j++) {
                dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
            }
        }
        return dp[column - 1];
    }
}
