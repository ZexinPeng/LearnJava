package pers.linus.dfs.number_of_islands_200;

import java.util.BitSet;

public class OptimizedSolution {
    private int islandNum = 0;
    private BitSet hasVisited = null;
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        hasVisited = new BitSet(grid.length * grid[0].length);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dfs(i, j, grid, true);
            }
        }
        return islandNum;
    }

    private void dfs(int row, int column, char[][] grid, boolean isFirstNode) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || hasVisited.get(row * grid[0].length + column)) {
            return;
        }
        hasVisited.set(row * grid[0].length + column, true);
        if (grid[row][column] == '0') {
            return;
        }
        else {
            if (isFirstNode) {
                islandNum++;
            }
            dfs(row - 1, column, grid, false);
            dfs(row + 1, column, grid, false);
            dfs(row, column - 1, grid, false);
            dfs(row, column + 1, grid, false);
        }
    }
}
