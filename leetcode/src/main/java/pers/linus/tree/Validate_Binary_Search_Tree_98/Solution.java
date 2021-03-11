package pers.linus.tree.Validate_Binary_Search_Tree_98;

import pers.linus.TreeNode;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, int floor, int ceil) {
        boolean leftValid;
        boolean rightValid;
        if (node.left != null) {
            if (node.left.val >= node.val || node.left.val < floor) {
                return false;
            }
            leftValid = dfs(node.left, floor, node.val - 1);
            if (!leftValid) {
                return false;
            }
        }
        if (node.right != null) {
            if (node.right.val <= node.val || node.right.val > ceil) {
                return false;
            }
            rightValid = dfs(node.right, node.val + 1, ceil);
            if (!rightValid) {
                return false;
            }
        }
        return true;
    }
}
