package pers.linus.leetcode.subString;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[] s1Array = new int[26];
        int[] s2Array = new int[26];

        for (int i = 0; i < s1.length();i++) {
            s1Array[s1.charAt(i) - 'a']++;
            s2Array[s2.charAt(i) - 'a']++;
        }

        for(int i = s1.length(); i < s2.length() ; i++) {
            if(match(s1Array, s2Array)) {
                return true;
            }
            s2Array[s2.charAt(i) - 'a']++;
            s2Array[s2.charAt(i - s1.length()) - 'a']--;
        }

        return match(s1Array, s2Array);
    }

    public boolean match(int[] s1Array, int[] s2Array) {
        for(int i = 0; i < s1Array.length; i++) {
            if(s1Array[i] != s2Array[i]) {
                return false;
            }
        }
        return true;
    }
}
