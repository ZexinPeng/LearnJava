package pers.linus.dynamic_programming.maximal_square_221;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        int maxValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == '1') {
                dp[i][0] = 1;
                maxValue = 1;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1') {
                dp[0][i] = 1;
                maxValue = 1;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    if (dp[i - 1][j - 1] != 0) {
                        int edgeLength = verifyEdge(i, j, (int) Math.sqrt(dp[i - 1][j - 1]), matrix);
                        dp[i][j] = (int) Math.pow(edgeLength + 1, 2);
                        maxValue = dp[i][j] > maxValue ? dp[i][j] : maxValue;
                        continue;
                    }
                    dp[i][j] = 1;
                    maxValue = dp[i][j] > maxValue ? dp[i][j] : maxValue;
                }
            }
        }
        return maxValue;
    }

    private int verifyEdge(int i, int j, int length, char[][] matrix) {
        int edgeLength = 0;
        while (edgeLength < length) {
            if (matrix[i][j - edgeLength - 1] == '0') {
                return edgeLength;
            }
            if (matrix[i - edgeLength - 1][j] == '0') {
                return edgeLength;
            }
            edgeLength++;
        }
        return length;
    }
}
