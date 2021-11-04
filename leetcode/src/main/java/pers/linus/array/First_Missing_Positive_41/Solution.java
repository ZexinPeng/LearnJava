package pers.linus.array.First_Missing_Positive_41;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().firstMissingPositive(new int[]{3,2,8,5,6}));
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = -1;
            }
        }
        int i = 0;
        while (i < n) {
            if (nums[i] < 0) {
                i++;
                continue;
            }
            int lastIndex = i;
            i = nums[i] - 1;
            nums[lastIndex] = -1;
            if (nums[i] == -1) {
                while (lastIndex < n && nums[lastIndex] == -1) {
                    lastIndex++;
                }
                i = lastIndex;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != -1) {
                return i + 1;
            }
        }
        return n - 1;
    }
}
