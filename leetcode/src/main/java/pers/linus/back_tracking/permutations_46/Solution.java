package pers.linus.back_tracking.permutations_46;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new LinkedList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums, 0, new LinkedList<Integer>());
        return result;
    }

    private void backTrack(int[] nums, int index, List<Integer> output) {
        if (index == nums.length - 1) {
            output.add(nums[index]);
            result.add(new LinkedList<Integer>(output));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            output.add(nums[i]);
            swap(index, i, nums);
            backTrack(nums, i + 1, output);
            output.remove(i + 1);
            swap(index, i, nums);
        }
    }

    private void swap(int first, int end, int[] nums) {
        int tmp = nums[first];
        nums[first] = nums[end];
        nums[end] = tmp;
    }
}
