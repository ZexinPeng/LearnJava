package pers.linus.back_tracking.Word_Break_139;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> dic = new LinkedList<>();
        dic.add("app");
        dic.add("le");
        dic.add("ce");
        System.out.println(new Solution().wordBreak("appappleleleapp", dic));
    }
    public boolean wordBreak(String str, List<String> wordDict) {
        // dp[i] represents to the ith the str whether is great
        boolean[] dp = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (String word: wordDict) {
                if (i - word.length() == -1 && str.startsWith(word)) {
                    dp[word.length() - 1] = true;
                    continue;
                }
                if (i - word.length() >= 0 && dp[i - word.length()]) {
                    if (str.substring(i - word.length() + 1, i + 1).equals(word)) {
                        dp[i] = true;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
//    public boolean wordBreak(String str, List<String> wordDict) {
//        if (str.equals("")) {
//            return true;
//        }
//        for (String word: wordDict) {
//            if (str.startsWith(word)) {
//                boolean res = wordBreak(str.substring(word.length()), wordDict);
//                if (res) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
