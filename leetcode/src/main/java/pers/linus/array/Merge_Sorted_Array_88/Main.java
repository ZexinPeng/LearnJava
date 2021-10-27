package pers.linus.array.Merge_Sorted_Array_88;

import pers.linus.CommonTool;

public class Main {
    public static void main(String[] args) {
        // 4,0,0,0,0,0
        // 2, 0
        int[] nums1 = new int[]{4,5,6,0,0,0};
        // 1,2,3,5,6
        // 1
        int[] nums2 = new int[]{1,2,3};
        new Solution().merge(nums1, 3, nums2, 3);
        CommonTool.printArray(nums1);
    }
}
