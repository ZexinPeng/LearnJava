package pers.linus.dfs.validate_binary_search_tree_98;

public class OptimizedSolution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer min, Integer max) {
        if (node != null) {
            if ((max != null && node.val >= max) || (min != null && node.val <= min)) {
                return false;
            }
            return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
        }
        return true;
    }
}
