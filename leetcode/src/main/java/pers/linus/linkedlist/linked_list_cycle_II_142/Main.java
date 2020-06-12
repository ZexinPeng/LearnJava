package pers.linus.linkedlist.linked_list_cycle_II_142;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode head = solution.new ListNode(3);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(0);
        head.next.next.next = solution.new ListNode(-4);
        head.next.next.next.next = head.next;
        Solution.ListNode listNode = solution.detectCycle(head);
        System.out.println(listNode.val);
    }
}
