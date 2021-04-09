package pers.linus.back_tracking.Next_Permutation_31;

import pers.linus.CommonTool;

public class Main {
    public static void main(String[] args) {
        // 1, 3, 2       213
        // 2, 3, 1
        // 5,4,7,5,3,2
        // 4,2,0,2,3,2,0
        int[] arr = new int[]{4,2,0,2,3,2,0};
        new Solution().nextPermutation(arr);
        CommonTool.printArray(arr);
    }
}
