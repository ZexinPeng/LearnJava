package pers.linus.dynamic_programming.palindromic_substrings_647;

public class Solution {
    private int count = 0;
    public int countSubstrings(String s) {
        if (s.length() < 1) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            expandCenter(i, i, s);
            expandCenter(i, i + 1, s);
        }
        return count;
    }

    private void expandCenter(int start, int end, String s) {
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start--) == s.charAt(end++)) {
                count++;
            }
            else {
                return;
            }
        }
    }
}
