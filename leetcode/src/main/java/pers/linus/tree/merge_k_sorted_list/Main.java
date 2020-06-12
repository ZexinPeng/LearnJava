package pers.linus.tree.merge_k_sorted_list;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode head1 = solution.new ListNode(1);
        head1.next = solution.new ListNode(4);
        head1.next.next = solution.new ListNode(5);
        Solution.ListNode head2 = solution.new ListNode(1);
        head2.next = solution.new ListNode(3);
        head2.next.next = solution.new ListNode(4);
        Solution.ListNode head3 = solution.new ListNode(2);
        head3.next = solution.new ListNode(6);

        Solution.ListNode[] listNodes = new Solution.ListNode[]{head1, head2, head3};

        Solution.ListNode result = solution.mergeKLists(listNodes);

        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
