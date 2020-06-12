package pers.linus.classLoader;

import pers.linus.classloader.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "pers.linus.classloader.Test";
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Class cls2 = classLoader.loadClass(str);
            System.out.println(cls2);
            Class cls = Class.forName(str);
            System.out.println(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
