package pers.linus.graph.Course_Schedule_II_210;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        new Solution().findOrder(2, new int[][]{});
    }

    HashMap<Integer, List<Integer>> graph = new HashMap();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[] res = new int[numCourses];
        int index = 0;

        for (int i = 0; i < prerequisites.length; i++) {
            List<Integer> list = graph.get(prerequisites[i][1]);
            if (list == null) {
                list = new LinkedList<Integer>();
                graph.put(prerequisites[i][1], list);
            }
            list.add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }

        // iterate all nodes whose in-degree is 0
        LinkedList<Integer> waitingList = new LinkedList();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                waitingList.add(i);
            }
        }

        while (!waitingList.isEmpty()) {
            int next = waitingList.poll();
            res[index++] = next;
            List<Integer> list = graph.get(next);
            if (list != null) {
                for (Integer neighbor: list) {
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 0) {
                        waitingList.add(neighbor);
                    }
                }
            }
        }

        if (index == numCourses) {
            return res;
        }
        return new int[0];
    }
}
