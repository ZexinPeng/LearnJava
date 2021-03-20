package pers.linus.array.merge_intervals_56;

public class Main {
    public static void main(String[] args) {
        // {1,3},{2,6},{8,10},{15,18}
        // {1, 4}, {5, 6}
        int[][] internals = new int[][]{{1, 4}};
        new Solution().merge(internals);
    }
}
