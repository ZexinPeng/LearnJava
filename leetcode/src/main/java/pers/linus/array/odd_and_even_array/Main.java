package pers.linus.array.odd_and_even_array;

import pers.linus.CommonTool;

public class Main {
    public static void main(String[] args) {
        // 2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1
        CommonTool.printArray(new Solution().exchange(new int[]{1,11,14}));
    }
}
