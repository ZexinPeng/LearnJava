package pers.linus.back_tracking.Next_Permutation_31;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int cur = nums.length - 2;
        // nums[cur] is the first element that breaks the descending order
        while (cur >= 0 && nums[cur] >= nums[cur + 1]) {
            cur--;
        }

        if (cur >= 0) {
            int last = nums.length - 1;
            while (nums[cur] >= nums[last]) {
                last--;
            }
            swap(nums, cur, last);
        }
        for (int i = cur + 1, j = nums.length - 1; i < j;) {
            swap(nums, i++, j--);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
