package pers.linus.dynamic_programming.Longest_Consecutive_Sequence_128;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                dp[i] = dp[i - 1] + 1;
            }
            else if (nums[i] == nums[i - 1]) {
                dp[i] = dp[i - 1];
            }
            else {
                dp[i] = 1;
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
