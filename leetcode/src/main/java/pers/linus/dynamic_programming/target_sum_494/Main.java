package pers.linus.dynamic_programming.target_sum_494;

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 1, 1, 1, 1};
//        int target = 3;
//        int[] nums = new int[]{1,2,7,9,981};
//        int target = 1000000000;
        int[] nums = new int[]{2, 2, 1, 1, 1};
        int target = 3;

        System.out.println(new DpSolution().findTargetSumWays(nums, target));
    }
}
