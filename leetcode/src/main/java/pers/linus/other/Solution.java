package pers.linus.other;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> resList = new LinkedList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        backTracking(nums, 0, new LinkedList<>());
        return resList;
    }

    private void backTracking(int[] nums, int currentIndex, List<Integer> tmpList) {
        if (currentIndex == nums.length - 1) {
            tmpList.add(nums[currentIndex]);
            resList.add(new LinkedList<>(tmpList));
            tmpList.remove(currentIndex);
            return;
        }
        for (int i = currentIndex; i <= nums.length - 1; i++) {
            swap(nums, currentIndex, i);
            tmpList.add(nums[currentIndex]);
            backTracking(nums, currentIndex + 1, tmpList);
            tmpList.remove(tmpList.size() - 1);
            swap(nums, currentIndex, i);
        }
    }

    private void swap(int[] nums, int first, int end) {
        int tmp = nums[first];
        nums[first] = nums[end];
        nums[end] = tmp;
    }
}
