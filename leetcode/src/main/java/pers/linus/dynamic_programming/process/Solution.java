package pers.linus.dynamic_programming.process;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{10, 1, 7, 7}, new int[]{8, 4, 2, 1}));
    }

    private int solution(int[] data, int[] process) {
        if (data.length < 1 || process.length != data.length) {
            return -1;
        }
        // dp[i] means the maximum data that the processor can process on day i
        int[] dp = new int[data.length];
        dp[0] = 0;
        dp[1] = Math.min(data[0], process[0]);
        for (int i = 2; i < data.length; i++) {
            int min = 0;
            for (int k = 1; k <= i; k++) {
                min += Math.min(data[k], process[k]);
            }
            // you could restart at any date between day 0 and i - 1
            for (int j = 1; j < i - 1; j++) {
                int tmp = dp[j - 1];
                for (int k = j + 1; k < data.length; k++) {
                    tmp += Math.min(data[k], process[k]);
                }
                min = Math.min(tmp, min);
            }
            dp[i] = min;
        }
        return dp[data.length - 1];
    }
}
