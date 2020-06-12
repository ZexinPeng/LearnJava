package pers.linus.leetcode.maxAreaOfIsland;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int length = grid[0].length;
        int width = grid.length;
        boolean[][] flagArray = new boolean[width][length];
        int ans = 0, tmp;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (grid[i][j] ==1 && !flagArray[i][j]) {
                    tmp = countArea(i, j, grid, flagArray);
                    ans = ans <  tmp ? tmp : ans;
                }
            }
        }

        return ans;
    }

    private int countArea(Integer i, Integer j, int[][] grid, boolean[][] flagArray) {
        int area = 1;
        flagArray[i][j] = true;
        if (j - 1 >= 0 && grid[i][j - 1] == 1 && !flagArray[i][j - 1]) {
            area = area + countArea(i, j - 1, grid, flagArray);
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1 && !flagArray[i][j + 1]) {
            area = area + countArea(i, j + 1, grid, flagArray);
        }
        if (i - 1 >= 0 && grid[i - 1][j] == 1 && !flagArray[i - 1][j]) {
            area = area + countArea(i - 1, j, grid, flagArray);
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1 && !flagArray[i + 1][j]) {
            area = area + countArea(i + 1, j, grid, flagArray);
        }
        return area;
    }
}
