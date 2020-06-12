package pers.linus.tree.common_father;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        nodeNum(root, p, q);
        return result;
    }

    private boolean nodeNum(TreeNode node, TreeNode p, TreeNode q) {
        if (node != null) {
            boolean leftExisted = nodeNum(node.left, p, q);
            boolean rightExisted = nodeNum(node.right, p, q);
            if (leftExisted && rightExisted) {
                result = node;
            }
            if (node == p || node == q) {
                if (leftExisted || rightExisted) {
                    result = node;
                }
                return true;
            }
            return leftExisted || rightExisted;
        }
        return false;
    }
}
