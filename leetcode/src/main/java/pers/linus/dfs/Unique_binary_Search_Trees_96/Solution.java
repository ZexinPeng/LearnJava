package pers.linus.dfs.Unique_binary_Search_Trees_96;

public class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            // represents the number of left parts
            for (int j = 0; j <= i; j++) {
                dp[i] += dp[j] * dp[i - j];
            }
        }
        return dp[n];
    }
//    public int numTrees(int n) {
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        int res = 0;
//        for (int i = 1; i <= n; i++) {
//            res += numTrees(i - 1) * numTrees(n - i);
//        }
//        return res;
//    }


}
