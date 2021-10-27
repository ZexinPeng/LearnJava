package pers.linus.union_find.Number_of_Provinces_547;

public class Solution {
    public static void main(String[] args) {
        new Solution().findCircleNum(new int[][]{{1,1,0},
                                                 {1,1,0},
                                                 {0,0,1}});
    }

    public int findCircleNum(int[][] isConnected) {
        int res = isConnected.length;
        int roots[] = new int[res];
        for (int i = 0; i < roots.length; i++) {
            roots[i] = i;
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i + 1; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    int rootI = findRoot(i, roots);
                    int rootJ = findRoot(j, roots);
                    if (rootI != rootJ) {
                        roots[rootJ] = rootI;
                        res--;
                    }
                }
            }
        }
        return res;
    }

    private int findRoot(int i, int[] roots) {
        while (roots[i] != i) {
            i = roots[i];
        }
        return i;
    }
}
