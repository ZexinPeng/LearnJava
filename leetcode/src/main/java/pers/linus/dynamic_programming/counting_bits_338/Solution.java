package pers.linus.dynamic_programming.counting_bits_338;

public class Solution {
    public int[] countBits(int num) {
        //dp[i]代表i的二进制形式1个数
        int[] dp = new int[num + 1];
        dp[0] = 0;
        int i = 0;
        int b = 1;
        while (b <= num) {
            while (i < b && i + b<= num) {
                dp[i + b] = dp[i] + 1;
                ++i;
            }
            i = 0;
            b *= 2;
        }
        return dp;
    }
}
