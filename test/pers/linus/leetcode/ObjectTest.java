package pers.linus.leetcode;

import java.util.HashMap;
import java.util.List;

public class ObjectTest {
    Object b = new Object();
    Object c = b;

    public void test() {
        System.out.println(b.equals(c));
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");

        System.out.println(a == b.intern());

        int c = 2;
        aaa(c);
        System.out.println(c);

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println(System.getSecurityManager());

        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(5);


    }

    public static void aaa(int b) {
        b++;
        return;
    }

}
