package pers.linus.leetcode.maxAreaOfIsland;

import org.junit.jupiter.api.Test;
import pers.linus.leetcode.repeatword.Main;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Main {
    Solution solution = new Solution();

    @Test
    public void case1() {
        int[][] grid = new int[][] {{0,0,1,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0}, {0,1,0,0,1,1,0,0,1,0,1,0,0}, {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0}, {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        assertEquals(6, solution.maxAreaOfIsland(grid));
    }

    @Test
    public void case2() {
        int[][] grid = new int[][] {{0,0,0,0,0,0,0,0}};
        assertEquals(0, solution.maxAreaOfIsland(grid));
    }

    @Test
    public void case3() {
        int[][] grid = new int[][] {{0,0,0,1,0,0,0,0}};
        assertEquals(1, solution.maxAreaOfIsland(grid));
    }

    @Test
    public void case4() {
        int[][] grid = new int[][] {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        assertEquals(4, solution.maxAreaOfIsland(grid));
    }



}