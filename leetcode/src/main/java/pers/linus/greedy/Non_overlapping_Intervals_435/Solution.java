package pers.linus.greedy.Non_overlapping_Intervals_435;

import java.util.Arrays;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int end = Integer.MIN_VALUE, cnt = 0;  //init end as intervals[0][1] other than 0, considering negative.
        for (int[] i : intervals) {
            if (i[0] >= end) {
                end = i[1];
                cnt++;
            }
        }
        return intervals.length - cnt;
    }
}
