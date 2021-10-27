package pers.linus.linkedlist.Sort_List_148;

import pers.linus.ListNode;

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // step 1: cut the list into two halves
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null || fast.next == null) {
                ListNode next = slow.next;
                slow.next = null;
                slow = next;
                continue;
            }
            slow = slow.next;
        }

        // step 2: sort the two lists respectively
        head = sortList(head);
        slow = sortList(slow);

        // step 3: merger two lists
        return merge(head, slow);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        }
        else {
            l2.next = merge(l2.next, l1);
            return l2;
        }
    }
}
