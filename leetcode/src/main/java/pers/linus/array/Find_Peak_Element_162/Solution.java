package pers.linus.array.Find_Peak_Element_162;

public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int mid = left + (right - left) /2;
            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if (left == nums.length - 1) {
            return left;
        }
        if (nums[left] > nums[right]) {
            return left;
        }
        return right;
    }
}
