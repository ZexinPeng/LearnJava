package pers.linus.dfs.flatten_binary_tree_to_linked_list_114;

class Solution {
    public void flatten(TreeNode root) {
        dfs(root);
    }

    public void printTreeDfs(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            printTreeDfs(node.left);
            printTreeDfs(node.right);
        }
    }

    private void dfs(TreeNode node) {
        if (node != null) {
            TreeNode rightNode = node.right;
            TreeNode leftRoot = node.left;
            if (leftRoot != null) {
                dfs(node.left);
                node.left = null;
                node.right = leftRoot;
                while (leftRoot.right != null) {
                    leftRoot = leftRoot.right;
                }
                leftRoot.right = rightNode;
            }
            if (rightNode != null) {
                dfs(rightNode);
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
