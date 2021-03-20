package pers.linus.greedy.Non_overlapping_Intervals_435;

public class Main {
    public static void main(String[] args) {
        // {{1,100},{11,22},{1,11},{2,12}}
        // {{1, 2}, {1, 2}, {1, 2}}
        // {{0,1},{3,4},{1,2}}
        int[][] intervals = new int[][]{{1,100},{11,22},{1,11},{2,12}};
        System.out.println(new Solution().eraseOverlapIntervals(intervals));
    }
}
