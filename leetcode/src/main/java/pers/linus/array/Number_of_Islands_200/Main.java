package pers.linus.array.Number_of_Islands_200;

public class Main {
    public static void main(String[] args) {
        //        char[][] grid = new char[][]{
        //                {'1','1','1','1','0'},
        //                {'1','1','0','1','0'},
        //                {'1', '1', '0', '0', '0'},
        //                {'0','0','0','0','0'}};
        char[][] grid = new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1', '1', '1'}};
        System.out.println(new Solution().numIslands(grid));
    }
}
