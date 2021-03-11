package pers.linus.tree.Validate_Binary_Search_Tree_98;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        int[] treeArray = new int[]{1, 1};
        TreeNode root = TreeNode.convertArray2BinaryTree(treeArray);
        System.out.println(new Solution().isValidBST(root));
    }
}
