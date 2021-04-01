package pers.linus.other;

import pers.linus.CommonTool;

import java.util.List;

public class Permutations_46 {
    public static void main(String[] args) {
        List<List<Integer>> resList = new Solution().permute(new int[]{1});
        for (List list: resList) {
            CommonTool.printIntegerList(list);
        }
    }
}
