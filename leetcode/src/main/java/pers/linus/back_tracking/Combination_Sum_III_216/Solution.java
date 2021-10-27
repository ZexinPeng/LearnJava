package pers.linus.back_tracking.Combination_Sum_III_216;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> resList = new LinkedList<List<Integer>>();
    Boolean[] booleans = new Boolean[9];
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(new LinkedList<>(), 0, n, 1, k);
        return resList;
    }

    public void backTracking(List<Integer> tmp, int cur, int target, int curNum, int length) {
        if (tmp.size() > length) {
            return;
        }
        if (cur == target && length == tmp.size()) {
            resList.add(new LinkedList<>(tmp));
            return;
        }
        while (curNum <= 9 && curNum + cur <= target) {
            tmp.add(curNum);
            backTracking(tmp, cur + curNum, target, curNum + 1, length);
            tmp.remove(tmp.size() - 1);
            curNum++;
        }
    }
}
