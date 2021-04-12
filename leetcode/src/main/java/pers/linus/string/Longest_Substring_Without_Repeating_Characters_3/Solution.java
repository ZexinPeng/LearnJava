package pers.linus.string.Longest_Substring_Without_Repeating_Characters_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                res = Math.max(res, i - start + 1);
            }
            else {
                int lastStart = start;
                start = map.get(s.charAt(i)) + 1;
                for (int j = lastStart; j < start; j++) {
                    map.remove(s.charAt(j));
                }
                map.put(s.charAt(i), i);
            }
        }
        return res;
    }
}
