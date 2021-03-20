package pers.linus.array.candy_135;

public class Main {
    public static void main(String[] args) {
        // 1, 3, 2, 2, 1
        // 1,2,87,87,87,2,1
        // 1, 2, 3, 1, 0
        int[] ratings = new int[]{1, 2, 3, 1, 0};
        System.out.println(new Solution().candy(ratings));
    }
}
