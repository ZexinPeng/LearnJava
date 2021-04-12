package pers.linus.linkedlist.Remove_Duplicates_from_Sorted_List_II_82;

import pers.linus.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode tail = dummy;
        ListNode cur = dummy.next;
        while (cur != null && cur.next != null) {
            if (cur.next.val == cur.val) {
                while (cur.next != null && cur.next.val == cur.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                tail.next = cur;
            }
            else {
                tail = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
