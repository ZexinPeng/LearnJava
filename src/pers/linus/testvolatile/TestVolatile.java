package pers.linus.testvolatile;

public class TestVolatile {
    public static volatile int race = 0;

    public static void increase() {
        race++;
    }
}
