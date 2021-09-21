package pers.linus.tree.Check_Completeness_of_Binary_Tree_958;

import pers.linus.ListNode;
import pers.linus.TreeNode;

import java.util.LinkedList;

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        boolean end = false;
        while (!list.isEmpty()) {
            TreeNode node = list.pollFirst();
            if (node.left != null) {
                if (end) {
                    return false;
                }
                list.add(node.left);
                if (node.right != null) {
                    list.add(node.right);
                }
            }
            else {
                end = true;
                if (node.right != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
