package pers.linus.back_tracking.Word_Break_II_140;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> dic = new LinkedList<>();
//        dic.add("cat");
//        dic.add("cats");
//        dic.add("and");
//        dic.add("sand");
//        dic.add("dog");
//        System.out.println(new Solution().wordBreak("catsandd", dic));
        dic.add("apple");
        dic.add("pen");
        dic.add("applepen");
        dic.add("pine");
        dic.add("pineapple");
        System.out.println(new Solution().wordBreak("pineapplepenapple", dic));
    }

    List<String> resList = new LinkedList();
    public List<String> wordBreak(String s, List<String> wordDict) {
        backTracking(s, wordDict, new String());
        return resList;
    }

    private void backTracking(String str, List<String> wordDict, String tmp) {
        if (str.equals("")) {
            resList.add(new String(tmp));
            return;
        }
        for (String word: wordDict) {
            if (str.startsWith(word)) {
                if (tmp.equals("")) {
                    tmp += word;
                } else {
                    tmp += " " + word;
                }
                backTracking(str.substring(word.length()),wordDict, tmp);
                tmp = tmp.substring(0, Math.max(tmp.length() - word.length() - 1, 0));
            }
        }
    }
}
