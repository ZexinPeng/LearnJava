package pers.linus.dynamic_programming.Best_Time_to_Buy_and_Sell_Stock_121;

public class Main {
    public static void main(String[] args) {
        //7,1,5,3,6,4
        int[] prices = new int[]{1, 4, 2};
        System.out.println(new Solution().maxProfit(prices));
    }
}
