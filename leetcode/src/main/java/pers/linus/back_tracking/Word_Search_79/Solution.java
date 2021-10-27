package pers.linus.back_tracking.Word_Search_79;

public class Solution {
    boolean[][] hasBeenVisited;
    public boolean exist(char[][] board, String word) {
        hasBeenVisited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    hasBeenVisited[i][j] = true;
                    if (backTracking(board, word,  1, i - 1, j)
                            || backTracking(board, word, 1, i + 1, j)
                            || backTracking(board, word, 1, i, j - 1)
                            || backTracking(board, word, 1, i, j + 1)) {
                        return true;
                    }
                    hasBeenVisited[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean backTracking(char[][] board, String word, int index, int row, int column) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row == board.length || column < 0 || column == board[0].length || hasBeenVisited[row][column] || word.charAt(index) != board[row][column]) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        hasBeenVisited[row][column] = true;
        if (backTracking(board, word, index + 1, row - 1, column)
                || backTracking(board, word, index + 1, row + 1, column)
                || backTracking(board, word, index + 1, row, column - 1)
                || backTracking(board, word, index + 1, row, column + 1)) {
            return true;
        }
        hasBeenVisited[row][column] = false;
        return false;
    }
}
