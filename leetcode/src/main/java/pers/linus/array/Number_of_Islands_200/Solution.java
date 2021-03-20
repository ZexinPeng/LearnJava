package pers.linus.array.Number_of_Islands_200;

public class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] hasVisited = new boolean[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    if (!hasVisited[i][j]) {
                        hasVisited[i][j] = true;
                        res++;
                        mark(grid, hasVisited, i - 1, j);
                        mark(grid, hasVisited, i + 1, j);
                        mark(grid, hasVisited, i, j + 1);
                        mark(grid, hasVisited, i, j - 1);
                    }
                }
            }
        }
        return res;
    }

    private void mark(char[][] grid, boolean[][] hasVisited, int row, int column) {
        if (row == grid.length || row < 0 || column == grid[0].length || column < 0|| grid[row][column] == '0' || hasVisited[row][column]) {
            return;
        }
        hasVisited[row][column] = true;
        mark(grid, hasVisited, row - 1, column);
        mark(grid, hasVisited, row + 1, column);
        mark(grid, hasVisited, row, column + 1);
        mark(grid, hasVisited, row, column - 1);
    }
}
