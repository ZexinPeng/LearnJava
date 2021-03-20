package pers.linus.linkedlist.Remove_Nth_Node_From_End_of_List_19_2;

import pers.linus.ListNode;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().removeNthFromEnd(
                ListNode.convertArray2List(new int[]{1, 2}), 2).val);
    }
}
