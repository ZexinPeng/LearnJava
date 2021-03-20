package pers.linus.greedy.jump_game_55;

public class DPSolution {
    public boolean canJump(int[] nums) {
        // dp[i] represents the furthest index that current location can reach at
        int[] dp = new int[nums.length];
        dp[nums.length - 1] = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            int max = i;
            for (int j = nums[i] + i; j > i; j--) {
                if (j >= nums.length - 1) {
                    max = nums.length - 1;
                    break;
                }
                max = dp[j] > max ? dp[j] : max;
            }
            dp[i] = max;
        }
        if (dp[0] < nums.length - 1) {
            return false;
        }
        return true;
    }
}
