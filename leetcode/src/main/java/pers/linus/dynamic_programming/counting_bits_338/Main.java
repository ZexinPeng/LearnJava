package pers.linus.dynamic_programming.counting_bits_338;

public class Main {
    public static void main(String[] args) {
        int[] dp = new Solution().countBits(6);
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
    }
}
