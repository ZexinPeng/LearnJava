package pers.interview.Q1;

import java.math.BigInteger;
import java.util.Arrays;

public class B {
    public static int solution(int[] nums) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");
        System.out.println(a.or(b));
        int[] hash = new int[1001];
        for (int num: nums) {
            hash[num]++;
        }
        int res = 0;
        for (int i = 2; i <= 2000; i++) {
            int[] cur = Arrays.copyOf(hash, 1001);
            int pair = 0;
            for (int num: nums) {
                if (i - num > 0 && i - num <= 1000 && cur[num] > 0 && cur[i - num] > 0) {
                    cur[num]--;
                    cur[i - num]--;
                    pair++;
                    // under the case that num == i - num
                    if (cur[num] < 0) {
                        cur[num] += 2;
                        pair--;
                    }
                }
            }
            res = Math.max(res, pair);
        }
//        System.err.println("Tip: Use System.err.println() to write debug messages on the output tab.");
        return res;
    }

    public static void main(String[] args) {
        System.out.println(B.solution(new int[]{2,2,2,3}));
    }
}
