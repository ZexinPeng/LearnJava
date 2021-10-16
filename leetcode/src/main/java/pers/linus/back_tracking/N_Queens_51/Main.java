package pers.linus.back_tracking.N_Queens_51;

import pers.linus.CommonTool;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> list = new Solution().solveNQueens(2);
        for (List l: list) {
            CommonTool.printStringList(l);
        }
    }
}
