package pers.linus.integer;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(11);
        Integer integer2 = Integer.valueOf(11);
        integer1 = Integer.valueOf(2);
        System.out.println(integer1.toString());
        System.out.println(integer2.toString());
        System.out.println(integer1 == integer2);
    }
}
