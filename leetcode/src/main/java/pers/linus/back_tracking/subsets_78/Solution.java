package pers.linus.back_tracking.subsets_78;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
//    List<List<Integer>> result = new LinkedList<List<Integer>>();
//    // key代表数的值, value代表数字在nums中的索引
//    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//    public List<List<Integer>> subsets(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            List<Integer> tmp = new LinkedList<Integer>();
//            tmp.add(nums[i]);
//            result.add(tmp);
//            map.put(nums[i], i);
//        }
//        int first = 0, end = nums.length - 1;
//        for (int i = 1; i < nums.length; i++) {
//            int tmp = end;
//            end = backTrack(first, end, nums);
//            first = tmp + 1;
//        }
//        result.add(new LinkedList<Integer>());
//        return result;
//    }
//
//    private int backTrack(int first, int end, int[] nums) {
//        int lastIndex = 0;
//        for (int i = first; i <= end; i++) {
//            List<Integer> tmp = result.get(i);
//            for (int j = map.get(tmp.get(tmp.size() - 1)) + 1; j < nums.length; j++) {
//                List<Integer> tmpList = new LinkedList<Integer>(result.get(i));
//                lastIndex++;
//                tmpList.add(nums[j]);
//                result.add(tmpList);
//            }
//        }
//        return lastIndex + end;
//    }
//    List<List<Integer>> resList = new LinkedList<List<Integer>>();
//    public List<List<Integer>> subsets(int[] nums) {
//        backTracking(nums, 0, new LinkedList<>());
//        return resList;
//    }
//
//    private void backTracking(int[] nums, int currentIndex, List<Integer> tmpList) {
//        if (currentIndex == nums.length - 1) {
//            tmpList.add(nums[currentIndex]);
//            resList.add(new LinkedList<>(tmpList));
//            tmpList.remove(tmpList.size() - 1);
//            resList.add(new LinkedList<>(tmpList));
//            return;
//        }
//        tmpList.add(nums[currentIndex]);
//        backTracking(nums, currentIndex + 1, tmpList);
//        tmpList.remove(tmpList.size() - 1);
//        backTracking(nums, currentIndex + 1, tmpList);
//    }

    LinkedList<List<Integer>> resList = new LinkedList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, new LinkedList<Integer>(), 0);
        return resList;
    }

    private void backTracking(int[] nums, LinkedList<Integer> tmpList, int cur) {
        if (cur == nums.length - 1) {
            tmpList.add(nums[cur]);
            resList.add(new LinkedList<>(tmpList));
            tmpList.pollLast();
            resList.add(new LinkedList<>(tmpList));
            return;
        }
        tmpList.add(nums[cur]);
        backTracking(nums, tmpList, cur + 1);
        tmpList.pollLast();
        backTracking(nums, tmpList, cur + 1);
    }
}
