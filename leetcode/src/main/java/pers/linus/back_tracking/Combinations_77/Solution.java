package pers.linus.back_tracking.Combinations_77;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> resList = new LinkedList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(0, new LinkedList<>(), k, n);
        return resList;
    }

    private void backTracking(int cur, LinkedList<Integer> res, int length, int maxNum) {
        if (res.size() == length) {
            resList.add(new LinkedList<>(res));
            return;
        }
        for (int i = cur + 1; i <= maxNum; i++) {
            res.add(i);
            backTracking(i, res, length, maxNum);
            res.removeLast();
        }
    }
}
