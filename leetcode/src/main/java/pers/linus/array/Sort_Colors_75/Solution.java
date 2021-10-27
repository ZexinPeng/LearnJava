package pers.linus.array.Sort_Colors_75;

import static pers.linus.CommonTool.swap;

public class Solution {
    final int RED = 0;
    final int BLUE = 2;
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == RED && i > left) {
                swap(left++, i--, nums);
            }
            if (nums[i] == BLUE && i < right) {
                swap(right--, i--, nums);
            }
        }
    }
}
