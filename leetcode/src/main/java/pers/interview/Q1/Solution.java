package pers.interview.Q1;//package pers.interview.Q1;
//
//import java.util.Scanner;
//import java.util.Stack;
//import java.util.stream.Stream;
//
//class Solution {
//
//    static int solution(Integer[] A) {
//        int res = 1;
//        for (int i = 1; i < A.length; i++) {
//            if (A[i] >= A[i - 1]) {
//                res++;
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        // Read from stdin, solve the problem, write answer to stdout.
//        Scanner in = new Scanner(System.in);
//        Integer[] A = getIntegerArray(in.next());
//        System.out.print(solution(A));
//    }
//
//    private static Integer[] getIntegerArray(String str) {
//        return Stream.of(str.split("\\,"))
//                .map(Integer::valueOf)
//                .toArray(Integer[]::new);
//    }
//}

import java.util.Scanner;
import java.util.stream.Stream;

class Solution {
    static int res = Integer.MAX_VALUE;
    static int solution(Integer[] loads) {
        dfs(loads, 0, 0, 0, true);
        dfs(loads, 0, 0, 0, false);
//        System.err.println("Tip: Use System.err.println() to write debug messages on the output tab.");
        return res;
    }

    private static void dfs(Integer[] loads, int one, int two, int index, boolean isOne) {
        if (index == loads.length) {
            res = Math.min(res, Math.abs(two - one));
            return;
        }
        if (isOne) {
            one += loads[index];
        } else {
            two += loads[index];
        }
        dfs(loads, one, two, index + 1, true);
        dfs(loads, one, two, index + 1, false);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] loads = getIntegerArray(in.next());

        System.out.print(solution(loads));
    }

    private static Integer[] getIntegerArray(String str) {
        return Stream.of(str.split("\\,"))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
    }
}