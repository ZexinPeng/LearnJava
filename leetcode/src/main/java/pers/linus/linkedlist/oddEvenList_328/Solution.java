package pers.linus.linkedlist.oddEvenList_328;

import pers.linus.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode evenHead = head.next;
        ListNode oddCurr = head;
        ListNode evenCurr = evenHead;
        while (evenCurr != null) {
            if (evenCurr.next == null) {
                break;
            }
            oddCurr.next = evenCurr.next;
            oddCurr = oddCurr.next;
            if (oddCurr.next == null) {
                evenCurr.next = null;
                break;
            }
            evenCurr.next = oddCurr.next;
            evenCurr = evenCurr.next;
        }
        oddCurr.next = evenHead;
        return head;
    }
}
