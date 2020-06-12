package pers.linus.leetcode.repeatword;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void case1() {
        System.out.println(solution.lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    @Test
    public void case2() {
        System.out.println(solution.lengthOfLongestSubstring("aaaaaaaaaa"));
    }

    @Test
    public void case3() {
        System.out.println(solution.lengthOfLongestSubstring("abcabc"));
    }

    @Test
    public void case4() {
        System.out.println(solution.lengthOfLongestSubstring("abaabc"));
    }

    @Test
    public void case5() {
        System.out.println(solution.lengthOfLongestSubstring("ababcda"));
    }

}