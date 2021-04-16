package pers.linus.linkedlist.Remove_Duplicates_from_Sorted_List_83;

import pers.linus.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode next = cur.next;
        while (next != null) {
            while (next != null && next.val == cur.val) {
                next = next.next;
            }
            if (next == null) {
                cur.next = null;
                break;
            }
            cur.next = next;
            cur = cur.next;
            next = next.next;
        }
        return head;
    }
}
