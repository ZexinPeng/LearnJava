package pers.linus.back_tracking.generate_parentheses_22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        List<String> list = new Solution().generateParenthesis(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
