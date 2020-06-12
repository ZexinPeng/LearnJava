package pers.linus.leetcode.recursion;

public class Recursion {
    public int plus(int n) {
        int sum = 0;
        if(n > 0) {
            sum = n + plus(n - 1);
        }
        return sum;
    }
}
