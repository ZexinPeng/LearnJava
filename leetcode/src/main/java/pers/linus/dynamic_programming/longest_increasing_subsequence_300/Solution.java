package pers.linus.dynamic_programming.longest_increasing_subsequence_300;

import java.util.Arrays;

public class Solution {
//    public int lengthOfLIS(int[] nums) {
//        // dp[i] represents the largest quantity from index zero to current number
//        int[] dp = new int[nums.length];
//        dp[0] = 1;
//        int res = 1;
//        for (int i = 1; i < nums.length; i++) {
//            int max = 0;
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    max = Math.max(dp[j], max);
//                }
//            }
//            dp[i] = max + 1;
//            res = Math.max(dp[i], res);
//        }
//        return res;
//    }
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
}
