package pers.linus.dynamic_programming.coin_change_322;

public class Main {
    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(new Solution().coinChange(new int[] {1, 2, 5}, 11));
    }
}
