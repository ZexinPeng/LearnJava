package pers.linus.leetcode.search;

public class Solution2 {
    public int search(int[] nums, int target) {
        int first = 0, last = nums.length - 1, middle = last / 2;
        int ans = -1;
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            else {
                return -1;
            }
        }

        while (first <= last) {
            if (target >= nums[first] && target <= nums[middle]) {
                if (target == nums[middle]) {
                    return middle;
                }
                last = middle;
            }
            else if ((target < middle && target <=last) || (target > nums[middle] && target <= nums[last])) {
                first = middle + 1;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }
}
