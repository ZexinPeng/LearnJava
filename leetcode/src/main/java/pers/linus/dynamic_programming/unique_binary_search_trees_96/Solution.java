package pers.linus.dynamic_programming.unique_binary_search_trees_96;

public class Solution {
    public int numTrees(int n) {
        // dp[i]代表1到i可以组成多少子树，因为以i为根的树可以分为1,2...i-1和i,i+1...n两棵子树,而1..i-1子树的数目又和i+1..n的相同
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++ ) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
