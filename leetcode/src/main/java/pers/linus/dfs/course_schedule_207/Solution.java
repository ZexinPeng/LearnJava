package pers.linus.dfs.course_schedule_207;

import java.util.HashSet;

public class Solution {
    private HashSet<Integer> courseSet = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] canFinish = new boolean[numCourses];
        for (int i = 0; i <numCourses; i++) {
            if (canFinish[i]) {
                continue;
            }
            courseSet.add(i);
            for (int j = 0; j < prerequisites.length; j++) {
                if (prerequisites[j][0] == i) {
                    courseSet.add(prerequisites[j][1]);
                    if (!findPrerequisite(prerequisites, prerequisites[j][1], canFinish)) {
                        return false;
                    }
                }
            }
            courseSet.remove(i);
            canFinish[i] = true;
        }
        return true;
    }

    private boolean findPrerequisite(int [][] prerequisites, int pre, boolean[] canFinish) {
        if (canFinish[pre]) {
            courseSet.remove(pre);
            return true;
        }
        for (int i = 0; i < prerequisites.length; i++) {
            if (prerequisites[i][0] == pre) {
                if (courseSet.contains(prerequisites[i][1])) {
                    return false;
                }
                else {
                    courseSet.add(prerequisites[i][1]);
                    if (!findPrerequisite(prerequisites, prerequisites[i][1], canFinish)) {
                        return false;
                    }
                }
            }
        }
        courseSet.remove(pre);
        canFinish[pre] = true;
        return true;
    }

//    List<Integer>[] list= null;
//    // 记录当前节点的状态，若值为0，表示当前节点未被访问过，若值为1则表明其被上层分支访问过，若为-1表示该节点所有的邻接节点无法形成环路
//    int[] flags = null;
//
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        if (numCourses < 2) {
//            return true;
//        }
//        flags = new int[numCourses];
//        list= new LinkedList[numCourses];
//        for (int i = 0; i < prerequisites.length; i++) {
//            if (list[prerequisites[i][0]] == null) {
//                list[prerequisites[i][0]] = new LinkedList<Integer>();
//            }
//            list[prerequisites[i][0]].add(prerequisites[i][1]);
//        }
//        for (int i = 0; i < numCourses; i++) {
//            if (hasDeadLock(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean hasDeadLock(int courseIndex) {
//        if (flags[courseIndex] == 1) {
//            return true;
//        }
//        if (flags[courseIndex] == -1) {
//            return false;
//        }
//        if (list[courseIndex] == null) {
//            flags[courseIndex] = -1;
//            return false;
//        }
//        flags[courseIndex] = 1;
//        for (int i = 0; i < list[courseIndex].size(); i++) {
//            if (hasDeadLock(list[courseIndex].get(i))) {
//                return true;
//            }
//        }
//        flags[courseIndex] = -1;
//        return false;
//    }

}
