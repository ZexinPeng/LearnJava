package pers.linus.generics;

public class Generic {
    public <T extends SuperClass> T test(T a) {
        System.out.println(a.getA());
        return a;
    }
}
