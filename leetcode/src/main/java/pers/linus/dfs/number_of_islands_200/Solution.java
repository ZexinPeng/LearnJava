package pers.linus.dfs.number_of_islands_200;

public class Solution {
    private int islandNum = 0;
    private boolean[][] hasVisited = null;
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        hasVisited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dfs(i, j, grid, true);
            }
        }
        return islandNum;
    }

    private void dfs(int row, int column, char[][] grid, boolean isFirstNode) {
        if (hasVisited[row][column]) {
            return;
        }
        hasVisited[row][column] = true;
        if (grid[row][column] == '0') {
            return;
        }
        else {
            if (isFirstNode) {
                islandNum++;
            }
            if (row > 0) {
                dfs(row - 1, column, grid, false);
            }
            if (row < grid.length - 1) {
                dfs(row + 1, column, grid, false);
            }
            if (column > 0) {
                dfs(row, column - 1, grid, false);
            }
            if (column < grid[0].length - 1) {
                dfs(row, column + 1, grid, false);
            }
        }
    }
}
