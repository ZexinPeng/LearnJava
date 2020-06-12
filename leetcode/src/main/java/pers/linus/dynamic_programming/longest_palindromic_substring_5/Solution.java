package pers.linus.dynamic_programming.longest_palindromic_substring_5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i ++) {
            dp[i][i] = true;
        }

        int left = 0, right = 0, maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            int singlePivot = expandCenter(i, i, s);
            int doublePivot = expandCenter(i, i + 1, s);
            int tmp = Math.max(singlePivot, doublePivot);
            if (tmp > maxLength) {
                left = i - (tmp - 1) / 2;
                right = i + tmp / 2;
                maxLength = tmp;
            }
        }
        return s.substring(left, right + 1);
    }

    private int expandCenter(int start, int end, String str) {
        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
