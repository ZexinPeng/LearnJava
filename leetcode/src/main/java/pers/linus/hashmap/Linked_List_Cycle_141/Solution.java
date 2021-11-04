package pers.linus.hashmap.Linked_List_Cycle_141;

import pers.linus.ListNode;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        new Solution().hasCycle(new ListNode(1));
    }
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap();
        int index = 0;
        while (head != null) {
            if (map.get(head) != null) {
                return true;
            }
            map.put(head, index++);
        }
        return false;
    }
}
