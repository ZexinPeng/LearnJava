package pers.linus.leetcode.findCircleNum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void case1() {
        int[][] array = new int[][]{{1,1,0}, {1,1,0}, {0,0,1}};
        assertEquals(2, solution.findCircleNum(array));
    }

    @Test
    public void case2() {
        int[][] array = new int[][]{{1,1,1,0,0}, {1,1,0,0,0}, {1,0,1,1,0}, {0,0,1,1,0}, {0,0,0,0,1}};
        assertEquals(2, solution.findCircleNum(array));
    }

    @Test
    public void case3() {
        int[][] array = new int[][]{{1,1,0}, {1,1,1}, {0,1,1}};
        assertEquals(1, solution.findCircleNum(array));
    }

    @Test
    public void case4() {
        int[][] array = new int[][]{{1,0,0}, {0,1,0}, {0,0,1}};
        assertEquals(3, solution.findCircleNum(array));
    }

    @Test
    public void case5() {
        int[][] array = new int[][]{{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
                                    {0,1,0,1,0,0,0,0,0,0,0,0,0,1,0},
                                    {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
                                    {0,1,0,1,0,0,0,1,0,0,0,1,0,0,0},
                                    {0,0,0,0,1,0,0,0,0,0,0,0,1,0,0},
                                    {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
                                    {0,0,0,1,0,0,0,1,1,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0},
                                    {1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
                                    {0,0,0,1,0,0,0,0,0,0,0,1,0,0,0},
                                    {0,0,0,0,1,0,0,0,0,0,0,0,1,0,0},
                                    {0,1,0,0,0,0,0,0,0,0,0,0,0,1,0},
                                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}};
        assertEquals(8, solution.findCircleNum(array));
    }

    @Test
    public void case6() {
        int[][] array = new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        assertEquals(1, solution.findCircleNum(array));
    }
}
