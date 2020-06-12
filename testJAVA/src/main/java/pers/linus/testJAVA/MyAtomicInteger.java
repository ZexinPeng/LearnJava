package pers.linus.testJAVA;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger extends AtomicInteger {
    @Override
    public int hashCode() {
        return super.get();
    }

    public MyAtomicInteger(int value) {
        super(value);
    }
}
