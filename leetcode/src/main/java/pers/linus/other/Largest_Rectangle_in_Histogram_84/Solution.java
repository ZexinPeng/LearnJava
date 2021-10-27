package pers.linus.other.Largest_Rectangle_in_Histogram_84;

public class Solution {
//    exceeding time limitation
//    public int largestRectangleArea(int[] heights) {
//        int res = 0;
//        for (int i = 0; i < heights.length; i++) {
//            int left = i - 1;
//            int right = i + 1;
//            int tmp = heights[i];
//            while (left >= 0 && heights[left] >= heights[i]) {
//                tmp += heights[i];
//                left--;
//            }
//            while (right < heights.length && heights[right] >= heights[i]) {
//                tmp += heights[i];
//                right++;
//            }
//            res = Math.max(tmp, res);
//        }
//        return res;
//    }

    public int largestRectangleArea(int[] heights) {
        // left[i] represents the index of the first element that is
        // lower than heights[i] leftward
        int[] left = new int[heights.length];
        // right[i] represents the index of the first element that is
        // lower than heights[i] rightward
        int[] right = new int[heights.length];
        left[0] = -1;
        right[heights.length - 1] = heights.length;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[i - 1]) {
                left[i] = i - 1;
            }
            else {
                int p = left[i - 1];
                while (p >= 0 && heights[p] >= heights[i]) {
                    p = left[p];
                }
                left[i] = p;
            }
        }
        for (int i = right.length - 2; i >= 0; i--) {
            if (heights[i] > heights[i + 1]) {
                right[i] = i + 1;
            }
            else {
                int p = right[i + 1];
                while (p < heights.length && heights[p] >= heights[i]) {
                    p = right[p];
                }
                right[i] = p;
            }
        }
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            res = Math.max(res, heights[i] * (i - left[i]) + heights[i] * (right[i] - i - 1));
        }
        return res;
    }
}
