package pers.linus.back_tracking.PermutationsII_47;

import pers.linus.CommonTool;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> res = new Solution().permuteUnique(new int[]{1, 2, 3});
        for (int i = 0; i < res.size(); i++) {
            CommonTool.printIntegerList(res.get(i));
        }
    }
}
