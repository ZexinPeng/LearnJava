package pers.linus.tree.Invert_Binary_Tree_226;

import pers.linus.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);
        swap(node);
    }

    private void swap(TreeNode father) {
        TreeNode tmp = father.left;
        father.left = father.right;
        father.right = tmp;
    }
}
