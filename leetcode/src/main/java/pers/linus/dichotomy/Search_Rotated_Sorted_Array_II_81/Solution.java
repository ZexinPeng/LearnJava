package pers.linus.dichotomy.Search_Rotated_Sorted_Array_II_81;

public class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                }
                else {
                    left = mid;
                }
            }
            else if (nums[left] > nums[mid]) {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid;
                }
                else {
                    right = mid;
                }
            }
            else {
                left++;
            }
        }
        if (nums[left] == target || nums[right] == target) {
            return true;
        }
        return false;
    }
}
