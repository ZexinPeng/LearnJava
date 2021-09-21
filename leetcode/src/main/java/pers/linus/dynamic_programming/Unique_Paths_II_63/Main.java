package pers.linus.dynamic_programming.Unique_Paths_II_63;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Solution solution = new Solution().getClass().newInstance();
        System.out.println(new Solution().uniquePathsWithObstacles(new int[][]{{0,1},{0,0}}));
    }
}
