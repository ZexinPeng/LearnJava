package pers.linus.exception;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws MyException {
        Test a = new Test();
        test();
    }

    private static void test() {
        while (true) {
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(1);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(2);
                break;
            }
        }
        System.out.println(123);
    }
}
