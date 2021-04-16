package pers.linus.linkedlist.Merge_k_Sorted_Lists_23;

import pers.linus.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }
            if (lists[0].val < min) {
                min = lists[0].val;
                index = i;
            }
        }
        if (index == -1) {
            return null;
        }
        ListNode head = lists[index];
        lists[index] = lists[index].next;
        head.next = mergeKLists(lists);
        return head;
    }
}
