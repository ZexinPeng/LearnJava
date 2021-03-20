package pers.linus;

import java.util.List;

public class CommonTool {
    public static void printIntegerList(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for(Integer num : list) {
            sb.append(num);
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }

    public static void printStringList(List<String> list) {
        StringBuffer sb = new StringBuffer();
        for(String num : list) {
            sb.append(num);
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
