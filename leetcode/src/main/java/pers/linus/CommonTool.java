package pers.linus;

import java.util.*;

public class CommonTool {
    public static void printIntegerList(List<Integer> list) {
        StringBuffer sb = new StringBuffer();
        for(Integer num : list) {
            sb.append(num);
            sb.append(", ");
        }
        int[] arr = new int[]{1, 1};
        System.out.println(sb.toString());
    }

    public static void printStringList(List<String> list) {
        StringBuffer sb = new StringBuffer();
        for(String num : list) {
            sb.append(num);
            sb.append(", ");
        }
        System.out.println(sb);
    }

    public static void printArray(int[] arr) {
        System.out.print("{ ");
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.print("}");
    }

    public static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void printHelper(TreeNode currPtr, String indent, boolean last) {
        // print the tree structure on the screen
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "     ";
            } else {
                System.out.print("L----");
                indent += "|    ";
            }

            System.out.println(currPtr.val);

            printHelper(currPtr.left, indent, false);
            printHelper(currPtr.right, indent, true);
        }
    }
}
