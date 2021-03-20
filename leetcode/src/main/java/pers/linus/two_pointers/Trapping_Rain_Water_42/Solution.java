package pers.linus.two_pointers.Trapping_Rain_Water_42;

public class Solution {
    public int trap(int[] height) {
        int res = 0;
        if (height.length < 3) {
            return res;
        }
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            if (height[start] <= height[end]) {
                int tmp = height[start];
                while (start < end) {
                    start++;
                    if (height[start] > tmp) {
                        break;
                    }
                    else {
                        res += tmp - height[start];
                    }
                }
            }
            else {
                int tmp = height[end];
                while (start < end) {
                    end--;
                    if (height[end] > tmp) {
                        break;
                    }
                    else {
                        res += tmp - height[end];
                    }
                }
            }
        }
        return res;
    }
}
