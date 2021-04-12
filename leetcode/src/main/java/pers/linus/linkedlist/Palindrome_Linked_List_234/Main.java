package pers.linus.linkedlist.Palindrome_Linked_List_234;

import pers.linus.ListNode;

public class Main {
    public static void main(String[] args) {
        // 1, 2, 3, 3, 2, 1
        System.out.println(new Solution().isPalindrome(ListNode.convertArray2List(new int[]{1, 2})));
    }
}
