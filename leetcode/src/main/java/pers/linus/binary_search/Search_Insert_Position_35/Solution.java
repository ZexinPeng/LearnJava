package pers.linus.binary_search.Search_Insert_Position_35;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1}, 1));
    }
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] >= target) {
            System.out.println(left);
        }
        return nums[left] >= target ? left : left + 1;
    }

}
