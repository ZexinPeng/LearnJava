package pers.linus.greedy.assign_cookies_455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int res = 0;
        int cur = s.length - 1;
        for (int i = g.length - 1; i >= 0; i--) {
            for (int j = cur; j >= 0; j--) {
                if (s[j] >= g[i]) {
                    res++;
                    cur = j - 1;
                    break;
                }
            }
        }
        return res;
    }
}
