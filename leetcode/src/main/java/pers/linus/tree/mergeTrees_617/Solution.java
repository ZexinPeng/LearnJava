package pers.linus.tree.mergeTrees_617;

import pers.linus.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return root1;
        }
        if (root1 == null) {
            root1 = new TreeNode(root2.val);
        }
        else {
            root1.val = root1.val + root2.val;
        }
        merge(root1, root2);
        return root1;
    }

    private void merge(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return;
        }
        if (node1.left == null) {
            if (node2.left != null) {
                node1.left = new TreeNode(node2.left.val);
                merge(node1.left, node2.left);
            }
        }
        else {
            if (node2.left != null) {
                node1.left.val = node1.left.val + node2.left.val;
                merge(node1.left, node2.left);
            }
            else {
                merge(node1.left, null);
            }
        }
        if (node1.right == null) {
            if (node2.right != null) {
                node1.right = new TreeNode(node2.right.val);
                merge(node1.right, node2.right);
            }
        }
        else {
            if (node2.right != null) {
                node1.right.val = node1.right.val + node2.right.val;
                merge(node1.right, node2.right);
            }
            else {
                merge(node1.right, null);
            }
        }
    }
}
