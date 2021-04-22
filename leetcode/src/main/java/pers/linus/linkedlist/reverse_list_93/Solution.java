package pers.linus.linkedlist.reverse_list_93;

import pers.linus.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        for (int i = 1; i < left; i++) {
            cur = cur.next;
        }
        ListNode last = cur;
        cur = cur.next;
        ListNode first = cur;
        ListNode prev = null;
        ListNode next = null;
        if (cur != null) {
            prev = cur;
            cur = cur.next;
            if (cur!= null) {
                next = cur.next;
            }
        }
        for (int i = 0; i < right - left && cur != null; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null) {
                next = next.next;
            }
        }
        first.next = cur;
        last.next = prev;
        return dummy.next;
    }
}
