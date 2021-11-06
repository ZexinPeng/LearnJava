package pers.linus.stack.next_greater_element_3_556;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().nextGreaterElement(2147483476));
    }
    public int nextGreaterElement(int n) {
        LinkedList<Integer> list = new LinkedList();
        while (n > 0) {
            list.addFirst(n % 10);
            n /= 10;
        }
        int[] arr = new int[list.size()];
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
