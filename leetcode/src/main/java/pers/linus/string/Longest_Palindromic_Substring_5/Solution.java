package pers.linus.string.Longest_Palindromic_Substring_5;

public class Solution {
    String res;
    public String longestPalindrome(String s) {
        res = s.substring(0,1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                findRes(i - 1, i, s);
            }
            if (i >= 2 && s.charAt(i) == s.charAt(i - 2)) {
                findRes(i - 2, i, s);
            }
        }
        return res;
    }

    private void findRes(int start, int end, String s) {
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) != s.charAt(end)) {
                if (end - start - 1 > res.length()) {
                    res = s.substring(start + 1, end);
                }
                return;
            }
            if (start == 0) {
                if (end - start + 1 > res.length()) {
                    res = s.substring(start, end + 1);
                    return;
                }
            }
            if (end == s.length() - 1) {
                if (end - start + 1 > res.length()) {
                    res = s.substring(start, end + 1);
                    return;
                }
            }
            start--;
            end++;
        }
    }
}
