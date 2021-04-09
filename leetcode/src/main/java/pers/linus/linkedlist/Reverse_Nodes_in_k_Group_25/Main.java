package pers.linus.linkedlist.Reverse_Nodes_in_k_Group_25;

import pers.linus.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode.printListNode(new Solution().reverseKGroup(ListNode.convertArray2List(new int[]{1, 2, 3, 4}), 3));
    }
}
