package pers.linus.leetcode.findCircleNum;

import java.util.*;

public class Solution {
    public int findCircleNum(int[][] M) {
        int length = M[0].length, ans = 0;
        List<Integer> list = new LinkedList<>();
        List<Integer> indexList = new LinkedList<>();
        for(int i = 0; i < length; i++) {
            indexList.add(i);
        }
        BitSet set = new BitSet(length);

        int i = 0;
        while (indexList.size() > 0) {
            indexList.remove(indexList.indexOf(i));
            if (!set.get(i)) {
                ans++;
            }
            set.set(i);
            for (int j = i + 1; j < length; j++) {
                if (M[i][j] == 1) {
                    list.add(j);
                    set.set(j);
                }
            }

            if (indexList.size() == 0) {
                break;
            }

            if (list.size() > 0) {
                i = list.get(0);
                list.remove(0);
            }
            else {
                i = indexList.get(0);
            }
        }
        return ans;
    }
}
