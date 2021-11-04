package pers.linus.graph.Minimum_Height_Trees_310;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        new Solution().findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}});
    }
    Map<Integer,List<Integer>> graph = new HashMap();
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> resList = new LinkedList();
        for (int i = 0; i < edges.length; i++) {
            List<Integer> list = graph.getOrDefault(edges[i][0], new LinkedList());
            list.add(edges[i][1]);
            graph.put(edges[i][0], list);
            list = graph.getOrDefault(edges[i][1], new LinkedList<Integer>());
            list.add(edges[i][0]);
            graph.put(edges[i][1], list);
        }
        int min = Integer.MAX_VALUE;
        int height = 0;
        for (int i = 0; i < n; i++) {
            int size = 0;
            LinkedList<Integer> topology = new LinkedList();
            topology.add(i);
            size++;
            Set<Integer> set = new HashSet();
            height = 0;
            while (size < n) {
                int nextLevelSize = topology.size();
                height++;
                for (int j = 0; j < nextLevelSize; j++) {
                    int currentVetice = topology.poll();
                    set.add(currentVetice);
                    List<Integer> list = graph.get(currentVetice);
                    for (Integer vertice: list) {
                        if (!set.contains(vertice)) {
                            topology.add(vertice);
                            size++;
                        }
                    }
                }
            }
            if (height < min) {
                resList = new LinkedList();
                resList.add(i);
                min = height;
            } else if (height == min) {
                resList.add(i);
            }
            

        }
        return resList;
    }
}
