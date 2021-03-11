package pers.linus;

import java.util.List;

public class CommonTool {
    public static void printList(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for(Integer num : list) {
            sb.append(num);
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
