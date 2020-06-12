package pers.linus.leetcode.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        if (nums.length < 3) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i = 0; nums[i] < 1 && i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1, target = nums[i], sum = 0;
            while (left < right) {
                sum = nums[left] + nums[right];
                if (sum < -target) {
                    left++;
                }
                else if (sum > -target) {
                    right--;
                }
                else {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    if (left >= right) {
                        continue;
                    }
                    left++;
                    right--;
                }
            }
            while (nums[i + 1] == nums[i] && i < nums.length - 2) {
                i++;
            }
        }
        return ans;
    }
}
