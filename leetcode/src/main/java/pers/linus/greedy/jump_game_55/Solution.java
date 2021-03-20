package pers.linus.greedy.jump_game_55;

// deprecated because the time limited
public class Solution {
    public boolean canJump(int[] nums) {
        return isReachable(nums, 0);
    }

    private boolean isReachable(int[] nums, int cur) {
        if (cur >= nums.length - 1) {
            return true;
        }
        if (nums[cur] == 0) {
            return false;
        }
        for (int i = nums[cur]; i > 0; i--) {
            if (isReachable(nums, cur + i)) {
                return true;
            }
        }
        return false;
    }
}
