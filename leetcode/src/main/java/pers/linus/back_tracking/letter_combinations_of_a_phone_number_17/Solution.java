package pers.linus.back_tracking.letter_combinations_of_a_phone_number_17;

import java.util.*;

public class Solution {
    List<String> result = new LinkedList<String>();
    Map<Character, String> phoneKeys = new HashMap<Character, String>(9);
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return result;
        }
        phoneKeys.put('2', "abc");
        phoneKeys.put('3', "def");
        phoneKeys.put('4', "ghi");
        phoneKeys.put('5', "jkl");
        phoneKeys.put('6', "mno");
        phoneKeys.put('7', "pqrs");
        phoneKeys.put('8', "tuv");
        phoneKeys.put('9', "wxyz");
        backTrack(new StringBuilder(), digits, 0);
        return result;
    }

    private void backTrack(StringBuilder sb, String digits, int index) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        String values = phoneKeys.get(digits.charAt(index));
        for (int i = 0; i < values.length(); i++) {
            sb.append(values.charAt(i));
            backTrack(sb, digits, index + 1);
            sb.deleteCharAt(index);
        }
    }
}
