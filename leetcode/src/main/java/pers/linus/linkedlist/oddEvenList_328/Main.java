package pers.linus.linkedlist.oddEvenList_328;

import pers.linus.ListNode;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        ListNode.printListNode(new Solution().oddEvenList(ListNode.convertArray2List(arr)));
    }
}
