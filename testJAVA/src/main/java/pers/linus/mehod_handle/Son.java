package pers.linus.mehod_handle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class Son extends Father{
    public void introduction() {
        try {
            MethodType mt = MethodType.methodType(void.class);
            MethodHandle mh = lookup().findSpecial(GrandFather.class, "introduction", mt, getClass());
            mh.invoke(this);
        }
        catch (Exception e) {

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Son().introduction();
    }
}
