package pers.linus.string.Find_All_Anagrams_in_String_438;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> resList = new LinkedList();
        int[] hash = new int[26];
        int left = 0;
        int right = 0;
        int count = p.length();
        for (int i = 0; i < p.length(); i++) {
            hash[p.charAt(i) - 'a']++;
        }
        while (right < s.length()) {
            if (hash[s.charAt(right) - 'a'] > 0) {
                hash[s.charAt(right) - 'a']--;
                right++;
                count--;
            } else {
                hash[s.charAt(left) - 'a']++;
                count++;
                left++;
            }
            if (count == 0) {
                resList.add(left);
            }
        }
        return resList;
    }
}
