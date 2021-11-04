package pers.linus.stack.Reorder_list_143;

import pers.linus.ListNode;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        new Solution().reorderList(node);
        System.out.println(1);
    }

    public void reorderList(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int size = stack.size();
        cur = head;
        ListNode next = cur.next;
        ListNode stackNode = stack.pop();
        while (stack.size() > size / 2 - 1) {
            cur.next = stackNode;
            stackNode.next = next;
            cur = next;
            stackNode = stack.pop();
            next = cur.next;
        }
        next.next = null;
    }
}
