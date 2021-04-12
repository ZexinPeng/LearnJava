package pers.linus.hashmap.Number_of_Provinces_547;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int res = 0;
        boolean[] isVisited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (!isVisited[i]) {
                res++;
                dfs(isConnected, isVisited, i);
            }
        }
        return res;
    }

    private void dfs(int[][] isConnected, boolean[] isVisited, int line) {
        isVisited[line] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[line][i] == 1 && !isVisited[i]) {
                dfs(isConnected, isVisited, i);
            }
        }
    }
}
