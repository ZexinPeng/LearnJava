package pers.linus.dichotomy.Sqrt_69;

public class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = (left + right) /2;
        while (left <= right) {
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            }
            else if (mid < x / mid) {
                left = mid - 1;
            }
            else {
                right = mid + 1;
            }
            mid = left + (right - left) /2;
        }
        return mid;
    }
}
