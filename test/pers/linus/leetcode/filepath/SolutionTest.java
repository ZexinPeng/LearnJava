package pers.linus.leetcode.filepath;

import org.junit.jupiter.api.Test;
import pers.linus.leetcode.repeatword.Main;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Main {

    Solution solution = new Solution();

    @Test
    public void case1() {
        assertEquals("/c", solution.simplifyPath("/a/../../b/../c//.//"));
    }

    @Test
    public void case2() {
        assertEquals("/", solution.simplifyPath("///..///.././"));
    }

    @Test
    public void case3() {
        assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void case4() {
        assertEquals("/home", solution.simplifyPath("/home//"));
    }

    @Test
    public void case5() {
        assertEquals("/a/b/c", solution.simplifyPath("/a//b////c/d//././/.."));
    }

    @Test
    public void case6() {
        String a = "aaaa";
        System.out.println(a.charAt(3));
    }
}