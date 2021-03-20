package pers.linus.greedy.jump_game_55;

public class GreedySolution {
    public boolean canJump(int[] nums) {
        int canJump = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= canJump) {
                canJump = i;
            }
        }
        if (canJump > 0) {
            return false;
        }
        return true;
    }
}
