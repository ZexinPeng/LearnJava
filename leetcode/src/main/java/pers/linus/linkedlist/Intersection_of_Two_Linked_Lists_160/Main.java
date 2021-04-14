package pers.linus.linkedlist.Intersection_of_Two_Linked_Lists_160;

import pers.linus.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        b.next = a;
        System.out.println(new Solution().getIntersectionNode(a, b));
    }
}
