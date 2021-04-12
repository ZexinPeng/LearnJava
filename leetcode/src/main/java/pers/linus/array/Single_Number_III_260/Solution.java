package pers.linus.array.Single_Number_III_260;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Set<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (resSet.contains(nums[i])) {
                resSet.remove(nums[i]);
            }
            else {
                resSet.add(nums[i]);
            }
        }
        int i = 0;
        for (Integer num: resSet) {
            res[i++] = num;
        }
        return res;
    }
}
