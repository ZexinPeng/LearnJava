package pers.linus.tree.Kth_Smallest_Element_in_BST_230;

import pers.linus.TreeNode;

public class Solution {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right = new TreeNode(5);
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        System.out.println(new Solution().kthSmallest(root, 3));
    }
    int res = 0;
    int order = 0;
    // find a node which has n - 1 nodes in its left sub tree
    public int kthSmallest(TreeNode root, int k) {
        preorder(root, k);
        return res;
    }

    private void preorder(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        preorder(node.left, k);
        order++;
        if (order == k) {
            res = node.val;
            return;
        }
        preorder(node.right, k);
    }
}
