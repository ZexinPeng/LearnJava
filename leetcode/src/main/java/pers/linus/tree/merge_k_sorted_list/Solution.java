package pers.linus.tree.merge_k_sorted_list;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 1 || lists[0] == null) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode current = head;
        ListNode minValueNode = new ListNode(Integer.MAX_VALUE);
        int minValueIndex = 0;

        Set<ListNode> nullList = new HashSet<ListNode>(lists.length);

        while (nullList.size() < lists.length) {
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < minValueNode.val) {
                        minValueNode = lists[i];
                        minValueIndex = i;
                    }
                }
            }
            current.next = minValueNode;
            current = current.next;
            if (minValueNode.next == null) {
                lists[minValueIndex] = null;
                nullList.add(minValueNode);
                minValueNode = new ListNode(Integer.MAX_VALUE);
                minValueIndex = 0;
            }
            else {
                lists[minValueIndex] = lists[minValueIndex].next;
                minValueNode = lists[minValueIndex];
            }
        }
        return head.next;
    }
}
