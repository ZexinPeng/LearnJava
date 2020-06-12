package pers.linus.dynamic_programming.word_break_139;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("123".substring(1));
        String s = "leetcode";
        String[] wordDict = {"leet", "code"};
        System.out.println(new DP_Solution().wordBreak(s, new LinkedList<String>(Arrays.asList(wordDict))));
    }
}
