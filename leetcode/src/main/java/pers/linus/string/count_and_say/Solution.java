package pers.linus.string.count_and_say;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(4));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String lastString = countAndSay(n - 1);
        LinkedList<int[]> list = new LinkedList();
        list.add(new int[]{lastString.charAt(0), 1});
        for (int i = 1; i < lastString.length(); i++) {
            if (lastString.charAt(i) == list.peekLast()[0]) {
                list.get(list.size() - 1)[1]++;
            } else {
                list.add(new int[]{lastString.charAt(i), 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] arr: list) {
            sb.append(arr[1]);
            sb.append(arr[0] - '0');
        }
        return sb.toString();
    }
}
