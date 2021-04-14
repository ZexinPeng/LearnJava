package pers.linus.linkedlist.Intersection_of_Two_Linked_Lists_160;

import pers.linus.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            if (curA == null && curB == null) {
                return null;
            }
            if (curA == null) {
                curA = headB;
                curB = curB.next;
                continue;
            }
            if (curB == null) {
                curB = headA;
                curA = curA.next;
                continue;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }
}
