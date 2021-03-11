package pers.linus.array.third_maximum_number_414;

public class Solution {
    public int thirdMax(int[] nums) {
    long maximum = Long.MIN_VALUE;
    long secondMaximum = maximum;
    long thirdMaximum = maximum;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == maximum || nums[i] == secondMaximum) {
        }
        if (nums[i] > maximum) {
            thirdMaximum = secondMaximum;
            secondMaximum = maximum;
            maximum = nums[i];
        }
        else if (nums[i] > secondMaximum) {
            thirdMaximum = secondMaximum;
            secondMaximum = nums[i];
        }
        else if (nums[i] > thirdMaximum) {
            thirdMaximum = nums[i];
        }
    }
    if (thirdMaximum == Long.MIN_VALUE) {
        return (int)maximum;
    }
    return (int)thirdMaximum;
    }
}
