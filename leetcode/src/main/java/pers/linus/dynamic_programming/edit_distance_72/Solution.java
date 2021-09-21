package pers.linus.dynamic_programming.edit_distance_72;

public class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.length() == 0) {
            return word2.length();
        }
        if (word2.length() == 0) {
            return word1.length();
        }
        /**
         * dp[i][j] means the minimum operation from word1.subword(0, i - 1) to word2.subword(0, j - 1)
         *              f       a       s       t
         *           0  1       2       3       4
         *       h   1
         *       o   2
         *       r   3
         *       s   4
         *       e   5
         */
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < word1.length() + 1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < word2.length() + 1; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i < word1.length() + 1; i++) {
            for (int j = 1; j < word2.length() + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    int min = Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1);
                    min = Math.min(min, dp[i - 1][j - 1]);
                    dp[i][j] = min;
                }
                else {
                    int min = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                    min = Math.min(min, dp[i][j - 1]);
                    dp[i][j] = min + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
