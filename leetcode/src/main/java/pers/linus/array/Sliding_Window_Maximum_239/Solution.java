package pers.linus.array.Sliding_Window_Maximum_239;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int maxIndex = maxIndexInWindow(nums, 0, k);
        res[0] = nums[maxIndex];
        // leftIndex = i, rightIndex = i + k - 1
        for (int i = 1; i + k - 1 < nums.length; i++) {
            if (i > maxIndex) {
                maxIndex = maxIndexInWindow(nums, i, k);
                res[i] = nums[maxIndex];
                continue;
            }
            if (nums[i + k - 1] >= nums[maxIndex]) {
                maxIndex = i + k - 1;
            }
            res[i] = nums[maxIndex];
        }
        return res;
    }

    private int maxIndexInWindow(int[] nums, int start, int k) {
        int max = nums[start];
        int maxIndex = start;
        for (int i = start + 1; i < start + k; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
