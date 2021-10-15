package pers.linus.greedy.Generate_Parentheses_22;

import pers.linus.CommonTool;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> resList = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        recursion(n, 0,0, new StringBuilder());
        CommonTool.printStringList(resList);
        return resList;
    }

    private void recursion(int target, int open, int close, StringBuilder prefix) {
        if (prefix.length() == target * 2) {
            resList.add(prefix.toString());
            return;
        }
        if (open < target) {
            prefix.append("(");
            recursion(target, open + 1, close, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
        }
        if (close < open) {
            prefix.append(")");
            recursion(target, open, close + 1, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}
