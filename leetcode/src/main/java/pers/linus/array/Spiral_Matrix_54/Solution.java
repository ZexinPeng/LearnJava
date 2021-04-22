package pers.linus.array.Spiral_Matrix_54;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int topRow = 0;
        int topColumn = 0;
        int bottomRow = matrix.length - 1;
        int bottomColumn = matrix[0].length - 1;
        while (topRow <= bottomRow && topColumn <= bottomColumn) {
            for (int i = topColumn; i <= bottomColumn; i++) {
                res.add(matrix[topRow][i]);
            }
            for (int i = topRow + 1; i <= bottomRow; i++) {
                res.add(matrix[i][bottomColumn]);
            }
            for (int i = bottomColumn - 1; topRow != bottomRow && i>= topColumn; i--) {
                res.add(matrix[bottomRow][i]);
            }
            for (int i = bottomRow - 1; topColumn != bottomColumn && i > topRow; i--) {
                res.add(matrix[i][topColumn]);
            }
            topRow++;
            topColumn++;
            bottomColumn--;
            bottomRow--;
        }
        return res;
    }
}
