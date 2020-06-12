package pers.linus.leetcode.search;

import org.junit.jupiter.api.Test;
import pers.linus.leetcode.repeatword.Main;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Main {
    Solution2 solution = new Solution2();

    @Test
    public void case1() {
        int nums[] = new int[]{4,5,6,7,0,1,2};
        assertEquals( 2, solution.search(nums, 6));
    }

    @Test
    public void case2() {
        int nums[] = new int[]{4,5,6,7,0,1,2,3};
        assertEquals( 3, solution.search(nums, 7));
    }

    @Test
    public void case3() {
        int nums[] = new int[]{6,7,8,9,0,1,2,3,4,5};
        assertEquals( 0, solution.search(nums, 6));
    }

    @Test
    public void case4() {
        int nums[] = new int[]{6,7,8,9,0,1,2,3,4,5};
        assertEquals( 1, solution.search(nums, 7));
    }

    @Test
    public void case5() {
        int nums[] = new int[]{6,7,8,9,0,1,2,3,4,5};
        assertEquals( 3, solution.search(nums, 9));
    }

    @Test
    public void case6() {
        int nums[] = new int[]{4,5,6,7,0,1,2,3};
        assertEquals( 1, solution.search(nums, 5));
    }

    @Test
    public void case7() {
        int nums[] = new int[]{4,5,6,7,0,1,2,3};
        assertEquals( 0, solution.search(nums, 4));
    }

    @Test
    public void case8() {
        int nums[] = new int[]{4,5,6,7,0,1,2,3};
        assertEquals( -1, solution.search(nums, 10));
    }

    @Test
    public void case9() {
        int nums[] = new int[]{1};
        assertEquals( -1, solution.search(nums, 2));
    }

    @Test
    public void case10() {
        int nums[] = new int[]{1, 3};
        assertEquals( 1, solution.search(nums, 3));
    }

    @Test
    public void case11() {
        int nums[] = new int[]{1, 3};
        assertEquals( 0, solution.search(nums, 1));
    }

    @Test
    public void case12() {
        BitSet bitset = new BitSet();
        bitset.set(0, true);
        bitset.set(3, true);
        System.out.println(bitset.get(0));
        System.out.println(bitset.get(1));
    }
}