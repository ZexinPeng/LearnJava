package pers.linus.back_tracking.combination_sum_39;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new LinkedList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {
            if (target < candidates[i]) {
                return result;
            }
            backTrack(target, candidates, i, new LinkedList<Integer>());
        }
        return result;
    }

    private void backTrack(int currentValue, int[] candidates, int index, List<Integer> output) {
        output.add(candidates[index]);
        currentValue = currentValue - candidates[index];
        if (currentValue == 0) {
            result.add(new LinkedList<Integer>(output));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (currentValue < candidates[i]) {
                return;
            }
            backTrack(currentValue, candidates, i, output);
            output.remove(output.size() - 1);
        }
    }
}
