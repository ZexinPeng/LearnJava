package pers.linus.array.odd_and_even_array;

public class Solution {
    public int[] exchange(int[] nums) {
        int cur = 0;
        int nextOdd = 0;
        for (int i = 0; i < nums.length && nextOdd < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                for (int j = nextOdd + 1; j < nums.length; j++, nextOdd++) {
                    if (nums[j] % 2 == 1) {
                        nextOdd = j;
                        break;
                    }
                }
                if (nextOdd < nums.length) {
                    swap(nums, i, nextOdd);
                }
            }
            else {
                nextOdd = Math.max(i, nextOdd);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
