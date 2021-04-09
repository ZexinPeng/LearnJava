package pers.linus.dynamic_programming.Best_Time_to_Buy_and_Sell_Stock_121;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxProfit(int prices[]) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i< prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
            Map<Integer, Integer> map = new HashMap<>();
        }
        return maxProfit;
    }
}
