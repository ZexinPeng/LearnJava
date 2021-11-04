package pers.linus.stack.daily_temperatures_739;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{77,77,77,77,77,41,77,41,41,77};
//        int[] nums = new int[]{76, 75, 74, 73};
        nums = new Solution().dailyTemperatures(nums);
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack();
        for (int i = 0; i < temperatures.length - 1; i++) {
            int record = temperatures[i];
            if (temperatures[i] < temperatures[i + 1]) {
                temperatures[i] = 1;
            } else {
                while (!stack.isEmpty() && record > stack.peek()[0]) {
                    int index = stack.pop()[1];
                    temperatures[index] = i - index;
                }
                stack.push(new int[]{temperatures[i], i});
                temperatures[i] = 0;
            }
            while (!stack.isEmpty() && record > stack.peek()[0]) {
                int index = stack.pop()[1];
                temperatures[index] = i - index;
            }
        }
        while (!stack.isEmpty() &&  temperatures[temperatures.length - 1] > stack.peek()[0]) {
            int index = stack.pop()[1];
            temperatures[index] = temperatures.length - 1 - index;
        }
        temperatures[temperatures.length - 1] = 0;
        return temperatures;
    }
}
