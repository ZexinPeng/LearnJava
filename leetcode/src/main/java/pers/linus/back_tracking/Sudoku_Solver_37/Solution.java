package pers.linus.back_tracking.Sudoku_Solver_37;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
//        char[][] board = new char[][]{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        char[][] board = new char[][]{{'.','.','9','7','4','8','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'.','2','.','1','.','9','.','.','.'},{'.','.','7','.','.','.','2','4','.'},{'.','6','4','.','1','.','5','9','.'},{'.','9','8','.','.','.','3','.','.'},{'.','.','.','8','.','3','.','2','.'},{'.','.','.','.','.','.','.','.','6'},{'.','.','.','2','7','5','9','.','.'}};
//        String str = new String("[[\".\",\".\",\"9\",\"7\",\"4\",\"8\",\".\",\".\",\".\"],[\"7\",\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\"2\",\".\",\"1\",\".\",\"9\",\".\",\".\",\".\"],[\".\",\".\",\"7\",\".\",\".\",\".\",\"2\",\"4\",\".\"],[\".\",\"6\",\"4\",\".\",\"1\",\".\",\"5\",\"9\",\".\"],[\".\",\"9\",\"8\",\".\",\".\",\".\",\"3\",\".\",\".\"],[\".\",\".\",\".\",\"8\",\".\",\"3\",\".\",\"2\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\",\"6\"],[\".\",\".\",\".\",\"2\",\"7\",\"5\",\"9\",\".\",\".\"]]").replace('\"', '\'').replace('[','{').replace(']', '}');
//        System.out.println(str);
        new Solution().solveSudoku(board);
        double target = 1;
    }
    boolean[][] rowMark = new boolean[9][9];
    boolean[][] colMark = new boolean[9][9];
    boolean[][] unitMark = new boolean[9][9];
    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '1';
                    rowMark[i][digit] = true;
                    colMark[j][digit] = true;
                    unitMark[findUnit(i, j)][digit] = true;
                }
            }
        }
        int[] next = findNext(board, 0, 0);
        if (next[0] == -1) {
            return;
        }
        backTracking(board, next[0], next[1]);
    }

    private boolean backTracking(char[][] board, int i, int j) {
        int[] next = findNext(board, i, j);
        for (int k = 0; k < 9; k++) {
            if (!rowMark[i][k] && !colMark[j][k] && !unitMark[findUnit(i, j)][k]) {
                rowMark[i][k] = true;
                colMark[j][k] = true;
                unitMark[findUnit(i, j)][k] = true;
                board[i][j] = (char)(k + '1');
                if (next[0] == -1 || backTracking(board, next[0], next[1])) {
                    return true;
                } else {
                    rowMark[i][k] = false;
                    colMark[j][k] = false;
                    unitMark[findUnit(i, j)][k] = false;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    private int[] findNext(char[][] board, int i, int j) {
        for (int k = 9 * i + j; k < 81; k++) {
            if (board[k / 9][k % 9] == '.') {
                return new int[]{k / 9, k % 9};
            }
        }
        return new int[]{-1, -1};
    }

    private int findUnit(int i, int j) {
        return 3 * (i / 3) + j / 3;
    }
}
