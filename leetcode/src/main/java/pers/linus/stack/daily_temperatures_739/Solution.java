package pers.linus.stack.daily_temperatures_739;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<int[]> stack = new Stack<int[]>();
        for (int i = 0; i < T.length; i++) {
            if (stack.size() == 0) {
                stack.push(new int[]{T[i], i});
                continue;
            }
            // int[0] 代表数值， int[1]代表索引
            int[] tmp = stack.peek();
            if (T[i] <= tmp[0]) {
                stack.push(new int[]{T[i], i});
                continue;
            }
            while (T[i] > tmp[0]) {
                T[tmp[1]] = i - tmp[1];
                stack.pop();
                if (stack.size() == 0) {
                    break;
                }
                tmp = stack.peek();
            }
            stack.push(new int[]{T[i], i});
        }
        while (stack.size() > 0) {
            int[] tmp = stack.pop();
            T[tmp[1]] = 0;
        }
        return T;
    }
}
