package pers.linus.dynamic_programming.target_sum_494;

public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        return getNum(nums, 0, S, 0, true) + getNum(nums, 0, S, 0, false);
    }

    private int getNum(int[] nums, int index, int target, int currentValue, boolean isMinus) {
        if (index == nums.length - 1) {
            if (isMinus) {
                return currentValue - nums[index] == target ? 1 : 0;
            }
            else {
                return currentValue + nums[index] == target ? 1 : 0;
            }
        }
        if (isMinus) {
            return getNum(nums, index + 1, target, currentValue - nums[index], true) + getNum(nums, index + 1, target, currentValue - nums[index], false);
        }
        else {
            return getNum(nums, index + 1, target, currentValue + nums[index], true) + getNum(nums, index + 1, target, currentValue + nums[index], false);
        }

    }
}
