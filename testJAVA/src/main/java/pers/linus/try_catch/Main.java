package pers.linus.try_catch;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(testTry());
        Test a = new Test(2);
        Test b = a.getClass().newInstance();
        System.out.println(b.a);
    }

    static class Test {
        int a;
        Test() {
            a = 1;
        }
        Test(int a) {
            this.a = a;
        }
    }

    private static String testTry() {
        String res;
        try {
            res = "try";
            throw new Exception();
        } catch (Exception e) {
            res = "catch";
        } finally {
            res = "finally";
        }
        res = "normal";
        return res;
    }
}
