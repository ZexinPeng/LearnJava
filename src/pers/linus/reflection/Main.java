package pers.linus.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        TestReflectionConstructorWithoutParameter testReflection = (TestReflectionConstructorWithoutParameter) Class.forName("pers.linus.reflection.TestReflectionConstructorWithoutParameter").newInstance();
        testReflection.sayHello("pzx");

        Class clazz = Class.forName("pers.linus.reflection.TestReflectionConstructorWithParameter");
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        TestReflectionConstructorWithParameter testReflection2 = (TestReflectionConstructorWithParameter) constructor.newInstance("pzx", 123);
        testReflection2.sayHello("pzx");
    }
}
