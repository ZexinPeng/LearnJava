package pers.linus.verify;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;

public class Main {

    private static final int MB = 1024 * 1024;
    private static int a;

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = new String("123");
        String str3 = str2.intern();
        String str4 = "MB";
        System.out.println(str1 == str3);



        System.out.println(inc());

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }

    public static int inc() {
        int x;
        try {
            x = 1;
            throw new IOException();
//            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    SubClass subClass = new SubClass();

}
