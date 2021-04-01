package pers.linus.linkedlist.Swap_Nodes_in_Pairs_24;

import pers.linus.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = dummy.next;
        while (cur.next != null) {
            ListNode next = cur.next;
            if (next.next != null) {
                cur.next = next.next;
            }
            else {
                cur.next = null;
            }
            next.next = cur;
            prev.next = next;
            if (next.next == null || next.next.next == null) {
                break;
            }
            prev = cur;
            cur = prev.next;
        }
        return dummy.next;
    }
}
