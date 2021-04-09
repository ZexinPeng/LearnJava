package pers.linus.tree.Diameter_of_Binary_Tree_543;

import pers.linus.TreeNode;

public class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
    }
}
