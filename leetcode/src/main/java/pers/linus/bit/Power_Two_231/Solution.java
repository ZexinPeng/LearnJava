package pers.linus.bit.Power_Two_231;

public class Solution {
    public static void main(String args[]) {
        System.out.println(new Solution().isPowerOfTwo(1));
    }
    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
