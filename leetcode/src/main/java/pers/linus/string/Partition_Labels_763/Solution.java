package pers.linus.string.Partition_Labels_763;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        new Solution().partitionLabels("ababcbacadefegdehijhklij");
    }

    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new LinkedList();
        int left = 0;
        int right;
        while (left < s.length()) {
            right = lastAppears(left, s);
            for (int i = left; i < right && i < s.length(); i++) {
                int curRight = lastAppears(i, s);
                right = curRight > right ? curRight : right;
            }
            ans.add(right - left + 1);
            left = right + 1;
        }
        return ans;
    }

    private int lastAppears(int left, String s) {
        int right = s.length() - 1;
        while (left < right && s.charAt(left) != s.charAt(right)) {
            right--;
        }
        return right;
    }
}
