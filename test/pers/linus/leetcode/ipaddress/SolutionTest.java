package pers.linus.leetcode.ipaddress;

import org.junit.jupiter.api.Test;
import pers.linus.leetcode.repeatword.Main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class SolutionTest extends Main {
    Solution solution  = new Solution();

    @Test
    public void case1() {
        System.out.println(solution.restoreIpAddresses("25525511135"));
    }

    @Test
    public void case2() {
        System.out.println(solution.restoreIpAddresses("0000"));
    }

    @Test
    public void case3() {
        System.out.println(solution.restoreIpAddresses("010010"));
    }

    @Test
    public void case4() {
        Set<String> set = new HashSet<>();
        set.add("12");
        set.add("0");
        set.add("123");
        List<String> list = new LinkedList<>(set);
        System.out.println(set);
    }

    @Test
    public void case5() {

    }
}