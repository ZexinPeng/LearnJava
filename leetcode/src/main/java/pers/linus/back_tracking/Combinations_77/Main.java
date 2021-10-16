package pers.linus.back_tracking.Combinations_77;

import pers.linus.CommonTool;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> resList = new Solution().combine(4, 4);
        for (List<Integer> list: resList) {
            CommonTool.printIntegerList(list);
        }
    }
}
