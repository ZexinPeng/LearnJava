package pers.linus.two_pointers.Longest_Increasing_Subsequence_300;

import java.util.List;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        // dp[i] represents the largest quantity from zero to current number
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = dp[j] + 1 > max ? dp[j] + 1 : max;
                }
            }
            dp[i] = max;
            max = 1;
            res = dp[i] > res ? dp[i] : res;
        }
        return res;
    }
}
