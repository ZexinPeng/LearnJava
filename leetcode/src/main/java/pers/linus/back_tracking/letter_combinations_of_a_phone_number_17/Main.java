package pers.linus.back_tracking.letter_combinations_of_a_phone_number_17;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "";
        List<String> list = new Solution().letterCombinations(str);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
