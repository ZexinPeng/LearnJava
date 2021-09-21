package pers.linus.generics;

public class Main {
    public static void main(String[] args) {
        Container<? extends SuperClass> container = new Container<>(new SubClass(5));
        container.test();
        new Container<>(new SubClass(8)).test();
        new Container<>().test();
    }
}
