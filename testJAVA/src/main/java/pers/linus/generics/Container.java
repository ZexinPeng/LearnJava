package pers.linus.generics;

public class Container<T extends SuperClass> {
    T t;

    public Container(T t) {
        this.t = t;
    }

    public Container() {

    }

    public void test() {
        System.out.println("This is the method test() in Container");
        System.out.println("The value of a in " + t.getClass() + " is " + t.getA());
    }
}
