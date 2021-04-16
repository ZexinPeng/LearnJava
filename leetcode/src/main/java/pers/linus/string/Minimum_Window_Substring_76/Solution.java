package pers.linus.string.Minimum_Window_Substring_76;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        String res = s;
        Set<Character> tSet = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            tSet.add(t.charAt(i));
        }
        LinkedList<Integer> indexList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (tSet.contains(s.charAt(i))) {
                indexList.add(i);
                tSet.remove(s.charAt(i));
            }
        }
        if (tSet.size() != 0) {
            return "";
        }
        int left = indexList.peekFirst();
        int right = indexList.peekLast();
        int newLeft = left;
        boolean time2End = false;
        while (!time2End && right <= s.length()) {
            char leftChar = s.charAt(newLeft);
            boolean hasNext = false;
            for (int i = left + 1; i < s.length(); i++) {
                if (s.charAt(i) == leftChar) {
                    if (i < right) {
                        if (hasNext) {
                            left = newLeft;
                        }
                        else {
                            left = i;
                        }
                        break;
                    }
                    else if (i > right) {
                        left = newLeft;
                        right = i;
                        break;
                    }
                }
                else if (t.indexOf(s.charAt(i)) != -1 && !hasNext) {
                    newLeft = i;
                    hasNext = true;
                }
                if (i == s.length() - 1) {
                    time2End = true;
                }
            }
            newLeft = left;
            if (right - left + 1 < res.length()) {
                res = s.substring(left, right + 1);
            }
            if (right == s.length() - 1) {
                break;
            }
        }
        return res;
    }
}
