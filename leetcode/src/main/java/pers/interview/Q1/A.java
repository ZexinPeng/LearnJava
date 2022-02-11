package pers.interview.Q1;

import java.util.HashMap;

public class A {
    public static String solution(String S) {
        // letter and the index its first occurs
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(S.charAt(0), 0);
        int start = 0;
        int end = 0;
        for (int i = 1; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (map.containsKey(ch)) {
                if (i - map.get(ch) > end - start) {
                    start = map.get(ch);
                    end = i;
                }
            } else {
                map.put(ch, i);
            }
        }
        System.err.println("Tip: Use System.err.println() to write debug messages on the output tab.");
        return S.substring(start, end + 1);
    }

    public static void main(String[] args) {
        System.out.println(A.solution("cbaabacb"));
    }
}
