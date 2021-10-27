package pers.linus.dichotomy.Find_First_Last_Position_Element_Sorted_Array_34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int cur = dichotomy(nums, target);
        if (cur == -1) {
            return new int[]{-1, -1};
        }
        int left = cur;
        int right = cur;
        for (int i = cur - 1; nums[i] == target && i >= 0; i--) {
            left--;
        }
        for (int i = cur + 1; nums[i] == target && i < nums.length; i++) {
            right++;
        }
        return new int[]{left, right};
    }

    private int dichotomy(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
