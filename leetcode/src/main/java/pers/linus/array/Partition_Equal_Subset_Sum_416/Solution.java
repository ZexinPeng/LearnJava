package pers.linus.array.Partition_Equal_Subset_Sum_416;

import java.util.Arrays;

public class Solution {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        int leftSum = 0;
        while (index < nums.length) {
            leftSum += nums[index];
            index++;
        }
        index--;
        int rightSum = 0;
        while (index > 0) {
            if (leftSum == rightSum) {
                return true;
            }
            rightSum += nums[index];
            leftSum -= nums[index];
            index--;
        }
        return false;
    }
}
