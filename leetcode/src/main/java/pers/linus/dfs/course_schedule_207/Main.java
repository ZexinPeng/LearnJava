package pers.linus.dfs.course_schedule_207;

public class Main {
    public static void main(String[] args) {
//        int[][] prerequisites = new int[][]{{0,2}, {0,1}, {2,3}, {3,4}, {4,5}, {4,1}};
        int[][] prerequisites = new int[][]{{1,0},{2,6},{1,7},{6,4},{7,0},{0,5}};
        System.out.println(new Solution().canFinish(8, prerequisites));
    }
}
