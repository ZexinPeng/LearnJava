package pers.linus.union_find.redundant_connection_684;

public class Solution {
    public static void main(String[] args) {
        new Solution().findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}});
    }
    public int[] findRedundantConnection(int[][] edges) {
        int[] res = null;
        int[] roots = new int[edges.length];
        for (int i = 0; i < roots.length; i++) {
            roots[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            int rootI = findRoot(edges[i][0] - 1, roots);
            int rootJ = findRoot(edges[i][1] - 1, roots);
            if (rootI != rootJ) {
                roots[rootJ] = rootI;
            } else {
                res = edges[i];
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
