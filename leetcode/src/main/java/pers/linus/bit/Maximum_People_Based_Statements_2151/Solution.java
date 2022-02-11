package pers.linus.bit.Maximum_People_Based_Statements_2151;

import java.util.BitSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString((int) 0x3333333333333333L));
        System.out.println(new Solution().maximumGood(new int[][]{{2,0}, {0,2}}));
    }
    int res = 0;
    public int maximumGood(int[][] statements) {
        dfs(statements, new BitSet(statements.length), 0);
        return res;
    }

    private void dfs(int[][] statements, BitSet bit, int index) {
        if (index == statements.length) {
            if (isValid(statements, bit)) {
                res = Math.max(res, bit.cardinality());
            }
            return;
        }
        bit.set(index, false);
        dfs(statements, bit, index + 1);
        bit.set(index, true);
        dfs(statements, bit, index + 1);
    }

    private boolean isValid(int[][] statements, BitSet bit) {
        for (int i = 0; i < statements.length; i++) {
            if (bit.get(i)) {
                for (int j = 0; j < statements.length; j++) {
                    if ((bit.get(j) && statements[i][j] == 0) || (!bit.get(j) && statements[i][j] == 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
