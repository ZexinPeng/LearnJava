package pers.linus.tree.hasPathSum_112;

import pers.linus.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.right == null) {
            return dfs(root.left, targetSum, root.val);
        }
        if (root.left == null) {
            return dfs(root.right, targetSum, root.val);
        }
        return dfs(root, targetSum, 0);
    }

    private boolean dfs(TreeNode node, int targetSum, int currentValue) {
        if (node == null) {
            if (targetSum == currentValue) {
                return true;
            }
            return false;
        }
        return dfs(node.left, targetSum, currentValue + node.val) | dfs(node.right, targetSum, currentValue + node.val);
    }
}
