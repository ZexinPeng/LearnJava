package pers.linus.dynamic_programming.minimum_path_sum_64;

public class Main {
    public static void main(String[] args) {
        int[][] path = new int[][]{
                {1,2,3},
                {4,5,6}};
        int result = new DPSolution().minPathSum(path);
        System.out.println(result);
    }
}
