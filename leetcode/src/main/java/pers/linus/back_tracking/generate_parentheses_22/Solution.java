package pers.linus.back_tracking.generate_parentheses_22;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> result = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return result;
        }
        backTrack(n, 0, new StringBuilder(), 0);
        return result;
    }

    // existedNum表示当前序列已有左括号数量， n表示左括号总数
    private void backTrack(int n, int existedNum, StringBuilder sb, int currentLength) {
        if (currentLength == 2 * n) {
            result.add(sb.toString());
            return;
        }
        if (existedNum < n) {
            sb.append('(');
            backTrack(n, existedNum + 1, sb, currentLength + 1);
            sb.deleteCharAt(currentLength);
        }
        if (currentLength < 2 * existedNum) {
            sb.append(')');
            backTrack(n, existedNum, sb, currentLength + 1);
            sb.deleteCharAt(currentLength);
        }
    }
}
