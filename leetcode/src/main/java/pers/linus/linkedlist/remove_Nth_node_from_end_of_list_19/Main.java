package pers.linus.linkedlist.remove_Nth_node_from_end_of_list_19;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);

        Solution.ListNode listNode = solution.removeNthFromEnd(head, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
