package pers.linus.stack.next_greater_element_3_556;

import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().nextGreaterElement(2147483476));
    }
    public int nextGreaterElement(int n) {
        int[] arr = new int[4];
        arr[0] = 8;
        arr[1] = 10;
        arr[2] = 3;
        arr[3] = 4;
        Arrays.sort(arr, 0, 3);
        System.out.println(arr[2]);

        PriorityQueue<int[]> p = new PriorityQueue<int[]>((a,b)->(a[0] - b[0]));

        LinkedList<int[]> resList = new LinkedList();
        resList.toArray(new int[][]{new int[resList.size()]});
        LinkedList<String> q = new LinkedList<String>();
        Collections.sort(q, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] arr1 = o1.split(" ");
                String[] arr2 = o2.split(" ");
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (String str: arr1) {
                    sb1.append(str);
                }
                for (String str: arr2) {
                    sb2.append(str);
                }
                String str1 = sb1.toString();
                String str2 = sb2.toString();
                if (str1.equals(str2)) {
                    return arr1[0].compareTo(arr2[0]);
                } else {
                    return str1.compareTo(str2);
                }
            }
        });
//        ["let1 art can","let2 own kit dig","let3 art zero","dig1 8 1 5 1","dig2 3 6"]
        System.out.println(" sss");
        System.out.println("own kit dig".compareTo("art zero"));

        PriorityQueue<Integer> tmp = new PriorityQueue<>();
        tmp.add(3);
        tmp.add(2);
        tmp.add(10);
        System.out.println(tmp.poll());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1,1);
        map.put(2,2);
        System.out.println(map.pollFirstEntry());
        LinkedList<Integer> list = new LinkedList();
        while (n > 0) {
            list.addFirst(n % 10);
            n /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        int index = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return - 1;
        }
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[index - 1] < arr[j]) {
                swap(index - 1, j, arr);
                return constructInt(arr);
            }
        }
        swap(index - 1, index++, arr);
        while (index < arr.length && arr[index] < arr[index - 1]) {
            swap(index - 1, index, arr);
            index++;
        }
        return constructInt(arr);
    }

    private int constructInt(int[] arr) {
        int base = 1;
        int res = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i] * base;
            base *= 10;
        }
        return res;
    }

    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
