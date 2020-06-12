package pers.linus.dynamic_programming.minimum_path_sum_64;

public class Main {
    public static void main(String[] args) {
        int[][] path = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}};
        int result = new OptimizeSolution().minPathSum(path);
        System.out.println(result);
    }
}
