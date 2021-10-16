package pers.linus.back_tracking.N_Queens_51;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<String>> resList = new LinkedList<>();
    public List<List<String>> solveNQueens(int n) {
        backTracking(new boolean[n][n][n], new LinkedList(), 0, n);
        return resList;
    }

    private void backTracking(boolean[][][] board, LinkedList<String> res, int depth, int n) {
        if (depth == n) {
            resList.add(new LinkedList<>(res));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(board, depth, i)) {
                res.add(drawBoard(i, n));
                drawChess(board, depth, i, true);
                backTracking(board, res, depth + 1, n);
                res.removeLast();
                drawChess(board, depth, i, false);
            }
        }
    }

    private void drawChess(boolean[][][] board, int row, int column, boolean isTaken) {
        for (int i = 0; i < board.length; i++) {
            board[row][i][row] = isTaken;
        }
        // vertical
        for (int i = 0; i < board.length; i++) {
            board[i][column][row] = isTaken;
        }
        // right top
        int i = row, j = column;
        while (i-- > 0 && j++ < board.length - 1) {
            board[i][j][row] = isTaken;
        }
        // left bottom
        i = row;
        j = column;
        while (j-- > 0 && i++ < board.length - 1) {
            board[i][j][row] = isTaken;
        }
        // left top
        i = row;
        j = column;
        while (i-- > 0 && j-- > 0) {
            board[i][j][row] = isTaken;
        }
        // right bottom
        i = row;
        j = column;
        while (i++ < board.length - 1 && j++ < board.length - 1) {
            board[i][j][row] = isTaken;
        }
    }

    private boolean isValid(boolean[][][] board, int row, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][column][i]) {
                return false;
            }
        }
        return true;
    }

    private String drawBoard(int index, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append('.');
        }
        sb.append('Q');
        for (int i = 0; i < n - index - 1; i++) {
            sb.append('.');
        }
        return sb.toString();
    }
}
