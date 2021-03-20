package pers.linus.tree.Symmetric_Tree_101;

import pers.linus.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return recursion(root.left, root.right);
    }

    private boolean recursion(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode != null) {
            return false;
        }
        if (leftNode != null && rightNode == null) {
            return false;
        }
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        return recursion(leftNode.left, rightNode.right) && recursion(leftNode.right, rightNode.left);
    }
}
