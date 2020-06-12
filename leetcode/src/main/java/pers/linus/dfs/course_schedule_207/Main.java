package pers.linus.dfs.course_schedule_207;

public class Main {
    public static void main(String[] args) {
//        int[][] prerequisites = new int[][]{{0,2}, {0,1}, {2,3}, {3,4}, {4,5}, {4,1}};
        int[][] prerequisites = new int[][]{{2,0},{1,0},{3,1},{3,2},{1,3}};
        System.out.println(new Solution().canFinish(6, prerequisites));
    }
}
