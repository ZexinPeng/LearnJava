package pers.linus.leetcode.ipaddress;

import java.util.*;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        Set<String> set = new HashSet<>();
        if (s.length() < 4 || s.length() > 12) {
            return new LinkedList<>(set);
        }

        StringBuilder str = new StringBuilder();
        String tmp1, tmp2, tmp3, tmp4;

        for (int i = 1; i < 4; i++) {
            tmp1 = s.substring(0, i);
            if (isOverflowOrHasZeroPrefix(tmp1)) {
                continue;
            }
            for (int j = 1; j < 4; j++) {
                if (s.length() - i - j< 1) {
                    continue;
                }
                tmp2 = s.substring(i, i + j);
                if (isOverflowOrHasZeroPrefix(tmp2)) {
                    continue;
                }
                for (int k = 1; k < 4; k++) {
                    if (s.length() - i - j - k < 1) {
                        continue;
                    }
                    tmp3 = s.substring(i + j, i + j + k);
                    if (isOverflowOrHasZeroPrefix(tmp3)) {
                        continue;
                    }
                    if (s.length() - i - j - k > 3) {
                        continue;
                    }
                    tmp4 = s.substring(i + j + k);
                    if (isOverflowOrHasZeroPrefix(tmp4)) {
                        continue;
                    }
                    set.add(str.append(tmp1).append('.').append(tmp2).append('.').append(tmp3).append('.').append(tmp4).toString());
                    str = new StringBuilder();
                }
            }
        }
        return new ArrayList<>(set);
    }

    private boolean isOverflowOrHasZeroPrefix(String s) {
        if (Integer.parseInt(s) > 255) {
            return true;
        }
        return s.charAt(0) == '0' && s.length() > 1;
    }
}
