package pers.linus.tree.Binary_Tree_Maximum_Path_Sum;

import pers.linus.TreeNode;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        new Solution().maxPathSum(root);
    }
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = maxPathSum(node.left);
        int right = maxPathSum(node.right);
        System.out.println(left);
        System.out.println(right);
        res = Math.max(left, res);
        res = Math.max(right, res);
        res = Math.max(left + right + node.val, res);
        return node.val + Math.max(left, right);
    }
}
