package pers.linus.dynamic_programming.coin_change_322;

public class Main {
    public static void main(String[] args) {
        int[] coins = new int[]{2, 5};
        int amount = 12;
        System.out.println(new Solution().coinChange(coins, amount));
    }
}
