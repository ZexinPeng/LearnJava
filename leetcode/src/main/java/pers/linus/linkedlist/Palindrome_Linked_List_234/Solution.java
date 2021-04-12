package pers.linus.linkedlist.Palindrome_Linked_List_234;

import pers.linus.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = slow;
        // reverse right half the list
        ListNode prev = slow;
        ListNode cur = slow.next;
        slow.next = null;
        ListNode next = null;
        if (cur != null) {
            next = cur.next;
        }
        while (cur != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (cur == null) {
                break;
            }
            next = cur.next;
        }
        slow = prev;
        while (head != null && head != secondHead) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
