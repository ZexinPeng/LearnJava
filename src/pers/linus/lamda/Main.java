package pers.linus.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //传统方式使用接口
        Transform<String ,Integer> transform1 = new Transform<String, Integer>() {
            @Override
            public Integer transform(String s, Integer v) {
                return Integer.valueOf(s);
            }
        } ;

        //Lambda方式使用接口,就是这么简单粗暴，没脾气
        Transform<String,Integer> transform2 = (s, v)-> Integer.valueOf(s);
        System.out.println(transform2.transform("5", 5));
        Plus plus = (a, b)-> a + b;
        System.out.println(plus.plus(1,2));
        List<String> list = new ArrayList<>();
        list.iterator();

    }
}
