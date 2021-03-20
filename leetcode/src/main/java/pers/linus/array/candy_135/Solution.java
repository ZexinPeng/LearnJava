package pers.linus.array.candy_135;

public class Solution {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] < ratings[i - 1]) {
                if (candy[i - 1] == 1) {
                    for (int j = i - 1; j >= 0; j--) {
                        candy[j]++;
                        if (j == 0 || ratings[j] >= ratings[j - 1] || candy[j] < candy[j - 1]) {
                            break;
                        }
                    }
                }
                candy[i] = 1;
            }
            else if (ratings[i] > ratings[i - 1]){
                candy[i] = candy[i - 1] + 1;
            }
            else {
                candy[i] = 1;
            }
        }
        int res = 0;
        for (int num : candy) {
            res += num;
        }
        return res;
    }
}
