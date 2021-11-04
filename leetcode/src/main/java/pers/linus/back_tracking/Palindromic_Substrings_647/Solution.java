package pers.linus.back_tracking.Palindromic_Substrings_647;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().countSubstrings("fdsklf"));
    }

    int ans = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            backTracking(s, i, i);
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                backTracking(s, i, i + 1);
            }
        }
        return ans;
    }

    private void backTracking(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
            ans++;
        }
    }
}
