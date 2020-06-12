package pers.linus.leetcode.repeatword;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0, j = 0; j < n; j++) {
            // 有重复字符
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1 , i);
            }
            ans = j - i + 1 > ans ? j - i + 1 : ans;
            map.put(s.charAt(j), j );
        }
        return ans;
    }
}
