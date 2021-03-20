package pers.linus.linkedlist.Remove_Nth_Node_From_End_of_List_19_2;

import pers.linus.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        curr = dummy;
        for (int i = 0; i < length - n; i++) {
            curr = curr.next;
        }
        if (curr.next.next == null) {
            if (curr == dummy) {
                return head.next;
            }
            curr.next = null;
        }
        else {
            ListNode tmp = curr.next.next;
            curr.next.next = null;
            curr.next = tmp;
        }
        return head;
    }
}
