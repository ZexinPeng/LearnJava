package pers.linus.dynamic_programming.longest_increasing_subsequence_300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length < 1) {
            return  0;
        }
        // dp[i]表示前i个元素最长上升字串的大小
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxLength = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxLength = dp[j] > maxLength ? dp[j] : maxLength;
                }
            }
            dp[i] = maxLength + 1;
            result = maxLength + 1 > result ? maxLength + 1 : result;
        }
        return result;
    }
}
