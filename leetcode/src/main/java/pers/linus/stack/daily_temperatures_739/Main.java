package pers.linus.stack.daily_temperatures_739;

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
//        int[] nums = new int[]{76, 75, 74, 73};
        int[] nums = new int[]{};
        nums = new Solution().dailyTemperatures(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
