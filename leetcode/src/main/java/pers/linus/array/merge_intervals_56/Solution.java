package pers.linus.array.merge_intervals_56;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new LinkedList<>();
        int currentEnd = intervals[0][1];
        int currentStart = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > currentEnd) {
                res.add(new int[]{currentStart, currentEnd});
                currentStart = intervals[i][0];
            }
            currentEnd = intervals[i][1] > currentEnd ? intervals[i][1] : currentEnd;
        }
        res.add(new int[]{currentStart, currentEnd});
        return res.toArray(new int[res.size()][]);
    }
    /**
     * this algorithm cannot solve the situation like [[1, 4], [5, 6]]
     */
//    public int[][] merge(int[][] intervals) {
//        BitSet hasMarked = new BitSet();
//        int resNum = intervals.length;
//        for (int i = 0; i < intervals.length; i++) {
//            if (hasMarked.get(intervals[i][0])) {
//                resNum--;
//            }
//            hasMarked.set(intervals[i][0], intervals[i][1] + 1);
//        }
//        int[][] res = new int[resNum][];
//        int resIndex = 0;
//        int index = 0;
//        while (hasMarked.nextSetBit(index) != -1) {
//            res[resIndex] = new int[2];
//            res[resIndex][0] = hasMarked.nextSetBit(index);
//            res[resIndex][1] = hasMarked.nextClearBit(res[resIndex][0]) - 1;
//            index = res[resIndex][1] + 1;
//            resIndex++;
//        }
//        return res;
//    }
}
