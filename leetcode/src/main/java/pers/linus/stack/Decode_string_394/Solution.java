package pers.linus.stack.Decode_string_394;

import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        new Solution().decodeString("3[a]2[bc]");
    }

    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack();
        Stack<String> resStack = new Stack();
        new PriorityQueue<Integer>((a,b)->(a- b));
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = 10 * count + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if (s.charAt(i) == '[') {
                resStack.push(res);
                res = "";
            } else if (s.charAt(i) == ']') {
                int times = countStack.pop();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < times; j++) {
                    sb.append(res);
                }
                res = resStack.pop() + sb.toString();
            } else {
                res += s.charAt(i);
            }
        }
        return res;
    }
}
