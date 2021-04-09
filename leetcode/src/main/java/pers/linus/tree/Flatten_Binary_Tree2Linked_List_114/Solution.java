package pers.linus.tree.Flatten_Binary_Tree2Linked_List_114;

import pers.linus.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root);
    }

    private TreeNode dfs(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode leftHead = dfs(node.left);
        TreeNode leftTail = leftHead;
        if (leftHead == null) {
            dfs(node.right);
            return node;
        }
        else {
            while (leftTail.right != null) {
                leftTail = leftTail.right;
            }
        }
        node.left = null;
        TreeNode rightHead = node.right;
        if (rightHead == null) {
            node.right = leftHead;
        }
        else {
            node.right = leftHead;
            leftTail.right = rightHead;
            dfs(rightHead);
        }
        return node;
    }

//    private TreeNode dfs(TreeNode node) {
//        if (node.left == null) {
//            return node;
//        }
//        TreeNode leftHead = null;
//        if (node.left != null) {
//            leftHead = dfs(node.left);
//        }
//        if (node.right != null) {
//            dfs(node.right);
//        }
//        if (node.right == null) {
//            node.right = leftHead;
//            node.left = null;
//        }
//        else {
//            TreeNode leftTail = leftHead;
//            while (leftTail.right != null) {
//                leftTail = leftTail.right;
//            }
//            leftTail.right = node.right;
//            node.right = leftHead;
//            node.left = null;
//        }
//        return node;
//    }
}
