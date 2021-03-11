package pers.linus.two_pointers.sum_15;

import pers.linus.CommonTool;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // [-1,0,1,2,-1,-4]
        // [-1,0,1,2,-1,-4,-2,-
        // -4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0
        int[] nums = new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        List<List<Integer>> resList = new Solution().threeSum(nums);
        for (List<Integer> list: resList) {
            CommonTool.printList(list);
        }
    }
}
