package pers.linus.array.findMin_33;

public class Solution {
    public int search(int[] nums, int target) {
        return specialDichotomy(nums, target, 0, nums.length - 1);
    }

    private int specialDichotomy(int[] nums,int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (nums[start] <= nums[middle]) {
            if (target <= nums[middle] && target >= nums[start]) {
                return normalDichotomy(nums, target, start, middle);
            }
            else {
                return specialDichotomy(nums, target, middle + 1, end);
            }
        }
        else {
            if (target >= nums[middle] && target <= nums[end]) {
                return normalDichotomy(nums, target, middle, end);
            }
            else {
                return specialDichotomy(nums, target, start, middle - 1);
            }
        }
    }

    private int normalDichotomy(int[] nums,int target, int start, int end) {
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == nums[middle]) {
                return middle;
            }
            else if (target < nums[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
