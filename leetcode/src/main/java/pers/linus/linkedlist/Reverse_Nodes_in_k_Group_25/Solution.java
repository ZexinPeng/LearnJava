package pers.linus.linkedlist.Reverse_Nodes_in_k_Group_25;

import pers.linus.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode lastHead = dummy;
        ListNode nextHead = head;
        ListNode cur = head;
        while (nextHead != null) {
            for (int i = 0; i < k; i++) {
                if (nextHead == null) {
                    return dummy.next;
                }
                nextHead = nextHead.next;
            }
            ListNode prev = cur;
            cur = cur.next;
            ListNode next = cur.next;
            prev.next = nextHead;
            for (int i = 0; i < k - 1; i++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }
            lastHead.next = prev;
            for (int i = 0; i < k; i++) {
                lastHead = lastHead.next;
            }
        }
        return dummy.next;
    }
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if (k == 1) {
//            return head;
//        }
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode currentHead = head;
//        ListNode nextHead = head;
//        ListNode tail = dummy;
//        while (nextHead != null) {
//            for (int i = 0; i < k; i++) {
//                if (nextHead == null) {
//                    return dummy.next;
//                }
//                nextHead = nextHead.next;
//            }
//            ListNode prev = currentHead;
//            ListNode cur = prev.next;
//            ListNode next = cur.next;
//            for (int i = 0; i < k -1; i++) {
//                cur.next = prev;
//                prev = cur;
//                cur = next;
//                if (next == null) {
//                    break;
//                }
//                next = next.next;
//            }
//            tail.next = prev;
//            tail = currentHead;
//            currentHead.next = nextHead;
//            currentHead = nextHead;
//        }
//        return dummy.next;
//    }
}
