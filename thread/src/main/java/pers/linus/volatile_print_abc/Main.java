package pers.linus.volatile_print_abc;

public class Main {
    private static volatile int times;
    public static void main(String[] args) {
            Thread a = new Thread(new Runnable() {
                public void run() {
                    System.out.println('A');
                    times++;
                }
            });
        Thread b = new Thread(new Runnable() {
            public void run() {
                while (times % 3 != 1) {
                }
                System.out.println('B');
                times++;
            }
        });
        Thread c = new Thread(new Runnable() {
            public void run() {
                while (times % 3 != 2) {
                }
                System.out.println('C');
            }
        });
        c.start();
        b.start();
        a.start();
    }
}
