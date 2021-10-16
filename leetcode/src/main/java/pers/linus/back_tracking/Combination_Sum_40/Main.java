package pers.linus.back_tracking.Combination_Sum_40;

import pers.linus.CommonTool;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> resList = new Solution().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        for (List<Integer> list: resList) {
            CommonTool.printIntegerList(list);
        }
    }
}
