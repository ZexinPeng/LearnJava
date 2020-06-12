package pers.linus.dynamic_programming.longest_palindromic_substring_5;

public class Main {
    public static void main(String[] args) {
        String str = "aaaa";
        Solution solution = new Solution();
        String result = solution.longestPalindrome(str);
        System.out.println(result);
    }
}
