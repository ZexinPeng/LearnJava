package pers.linus.dynamic_programming.Longest_Common_Subsequence_1143;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // dp[i][j] represents the longest common subsequence
        // from 0 to i in text1 and from 0 to j in text2
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == text2.charAt(0)) {
                for (int j = i; j < text1.length(); j++) {
                    dp[j][0] = 1;
                }
            }
        }
        for (int i = 0; i < text2.length(); i++) {
            if (text1.charAt(0) == text2.charAt(i)) {
                for (int j = i; j < text2.length(); j++) {
                    dp[0][j] = 1;
                }
            }
        }
        for (int i = 1; i < text1.length(); i++) {
            for (int j = 1; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1]+ 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length() - 1][ text2.length() - 1];
    }
}
