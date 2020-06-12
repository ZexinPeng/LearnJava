package pers.linus.leetcode.search;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        else if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }
        return unsortedArrayHandler(nums,0, nums.length - 1, target);
    }

    public int unsortedArrayHandler(int[] nums, int first, int last, int target) {
        if (first > last) {
            return -1;
        }
        int index = -1;
        int middle = (first + last) / 2;
        if (nums[first] <= nums[middle] && target >= nums[first] && target <= nums[middle]) {
            index = binarySearch(nums, first, middle, target);
            if (index != -1) {
                return index;
            }
        }
        if (nums[middle + 1] <= nums[last] && target >= nums[middle + 1] && target <= nums[last]) {
            index = binarySearch(nums, middle + 1, last, target);
            if (index != -1) {
                return index;
            }
        }


        if (nums[first] > nums[middle]) {
            index = unsortedArrayHandler(nums, first, middle, target);
            if (index != -1) {
                return index;
            }
        }

        if (nums[middle + 1] > nums[last]) {
            index = unsortedArrayHandler(nums, middle + 1, last, target);
            if (index != -1) {
                return index;
            }
        }


        return index;
    }

    public int binarySearch(int[] nums, int first, int last, int target) {
        int index = -1;
        int middle = (first + last) / 2;
        while(first <= last) {
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                last = middle;
            }
            else {
                first = middle + 1;
            }
            middle = (first + last) / 2;
        }
        return index;
    }
}
