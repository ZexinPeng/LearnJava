package pers.linus.array.Minimum_Size_Subarray_Sum_209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int res = Integer.MAX_VALUE;
        int cur = 0;
        while (right < nums.length) {
            while (right < nums.length) {
                cur = cur + nums[right];
                if (cur >= target) {
                    break;
                }
                right++;
            }
            if (cur >= target) {
                while (left < right && cur >= target) {
                    res = Math.min(right - left + 1, res);
                    cur = cur - nums[left];
                    left++;
                }
            }
            if (left == right && cur >= target) {
                return 1;
            }
            right++;
        }
        if (res != Integer.MAX_VALUE) {
            return res;
        }
        return 0;
    }
}
