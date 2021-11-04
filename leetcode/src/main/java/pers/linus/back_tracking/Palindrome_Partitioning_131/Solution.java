package pers.linus.back_tracking.Palindrome_Partitioning_131;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().partition("abbab").size());
    }
    List<List<String>> resList = new LinkedList();
    public List<List<String>> partition(String s) {
        backTracking(s, 0, new LinkedList());
        return resList;
    }

    private void backTracking(String str, int left, LinkedList<String> tmp) {
        if (left == str.length()) {
            resList.add(new LinkedList(tmp));
            return;
        }
        int right = left;
        while (right < str.length()) {
            if (isPalindrome(str.substring(left, right + 1))) {
                tmp.add(str.substring(left, right + 1));
                backTracking(str, right + 1, tmp);
                tmp.removeLast();
            }
            right++;
        }
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
