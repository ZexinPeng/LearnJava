package pers.linus.leetcode.threesum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if (nums.length < 3) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] >= 0) {
                if(nums[i] == 0 && nums[i + 1] == 0 && nums[i + 2] == 0) {
                    list = new LinkedList<>();
                    list.add(0);
                    list.add(0);
                    list.add(0);
                    ans.add(list);
                }
                break;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = nums.length - 1; k > j; k--) {
                    if (nums[k] + nums[i] + nums[k] < 0) {
                        break;
                    }
                    if (nums[k] + nums[i] + nums[j] == 0) {
                        list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        ans.add(list);
                        break;
                    }
                }
            }
        }

        List<Integer> first;
        List<Integer> second;
        for (int i = 0; i < ans.size() - 1; i++) {
            first = ans.get(i);
            for (int j = i + 1; j < ans.size(); j++) {
                second = ans.get(j);
                if (first.get(0) == second.get(0)) {
                    if (first.get(1) == second.get(1)) {
                        ans.remove(j);
                        j--;
                    }
                }
            }
        }

        return ans;
    }
}
