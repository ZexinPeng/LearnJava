package pers.linus.tree.LowestCommonAncestorofBinaryTree_236;

import pers.linus.TreeNode;

public class Solution {
    /**
     * my solution is not good, I find a better one but not easy to understand
     */
//    private TreeNode res;
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        dfs(root, p.val, q.val);
//        return res;
//    }
//
//    private void dfs(TreeNode node, int p, int q) {
//        if (res != null || node == null) {
//            return;
//        }
//        if (node.val == p) {
//            if (findOne(node.left, q) || findOne(node.right, q)) {
//                res = node;
//            }
//            return;
//        }
//        if (node.val == q) {
//            if (findOne(node.left, p) || findOne(node.right, p)) {
//                res = node;
//            }
//            return;
//        }
//        if ((findOne(node.left, p) && findOne(node.right, q)) ||
//                (findOne(node.left, q) && findOne(node.right, p))) {
//            res = node;
//            return;
//        }
//        dfs(node.left, p, q);
//        dfs(node.right, p , q);
//    }
//
//    private boolean findOne(TreeNode node, int val) {
//        if (node == null) {
//            return false;
//        }
//        if (node.val == val) {
//            return true;
//        }
//        return findOne(node.left, val) || findOne(node.right, val);
//    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        else if (right == null) {
            return left;
        }
        else {
            return root;
        }
    }
}
