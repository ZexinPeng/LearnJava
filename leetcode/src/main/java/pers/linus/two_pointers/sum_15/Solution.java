package pers.linus.two_pointers.sum_15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new LinkedList<>();
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length - 1;
        if (nums.length < 3 || nums[first] > 0 || nums[last] < 0) {
            return resList;
        }
        while (nums[first] < 0) {
            while (nums[last] > 0) {
                if (nums[first] + nums[last] + nums[last - 1] < 0) {
                    break;
                }
                int index = Arrays.binarySearch(nums, first + 1, last, - (nums[first] + nums[last]));
                if (index > first) {
                    insert(resList, nums[first], nums[index], nums[last]);
                }
                while(nums[last - 1] == nums[last]) {
                    last--;
                }
                last--;
            }
            while (nums[first + 1] == nums[first]) {
                first++;
            }
            first++;
            last = nums.length - 1;
        }
        if (nums[first] == 0 && first + 2 < nums.length && nums[first + 1] == 0 && nums[first + 2] == 0) {
            insert(resList, 0, 0, 0);
        }
        return resList;
    }

    private void insert(List<List<Integer>> resList, int num1, int num2, int num3) {
        List<Integer> tmp = new LinkedList<>();
        tmp.add(num1);
        tmp.add(num2);
        tmp.add(num3);
        resList.add(tmp);
    }
}
