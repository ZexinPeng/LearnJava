package pers.linus.linkedlist.linked_list_cycle_II_142;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while (!set.contains(head) && head != null) {
            set.add(head);
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        return head;
    }
}
