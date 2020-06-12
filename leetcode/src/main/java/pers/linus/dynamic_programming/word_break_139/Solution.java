package pers.linus.dynamic_programming.word_break_139;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] mem = new Boolean[s.length()];
        return cutString(s, 0, new HashSet(wordDict), mem);
    }

    private boolean cutString(String str,int start, HashSet<String> worDict, Boolean[] mem) {
        if (start == str.length()) {
            return true;
        }
        if (mem[start] != null) {
            return mem[start];
        }
        for (int end = start + 1; end < str.length() + 1; end++) {
            String tmp = str.substring(start, end);
            if (worDict.contains(tmp) && cutString(str, end, worDict, mem)) {
                mem[start] = true;
                return true;
            }
        }
        mem[start] = false;
        return false;
    }
}
