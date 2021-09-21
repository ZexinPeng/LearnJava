package pers.linus.copy;

public class Main {
    private static void test (Main a) {
        a = new Main();
        System.out.println("ssss" + a);
    }

    public static void main(String[] args) {
        Main b = new Main();
        test(b);
        System.out.println(b);
    }

//    private static void test (Test a) {
//        a.setA(10);
//    }
//
//    public static void main(String[] args) {
//        Test a = new Test(5);
//        test(a);
//        System.out.println(a.a);
//    }
}
