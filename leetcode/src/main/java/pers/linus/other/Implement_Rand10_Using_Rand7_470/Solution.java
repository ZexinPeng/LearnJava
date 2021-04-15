package pers.linus.other.Implement_Rand10_Using_Rand7_470;

public class Solution {
    public int rand7() {
        return 7;
    }

    public int rand10() {
        int row, column, idx;
        do {
            row = rand7();
            column = rand7();
            idx = column + (row - 1) * 7;
        } while (idx > 40);
        return idx % 10 + 1;
    }
}
