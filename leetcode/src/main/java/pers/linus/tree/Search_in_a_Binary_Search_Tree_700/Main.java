package pers.linus.tree.Search_in_a_Binary_Search_Tree_700;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        int nullNum = Integer.MIN_VALUE;
        int[] treeArray = new int[]{5, 3, 2, 2, 7, nullNum, nullNum, 1};
        TreeNode root = TreeNode.convertArray2BinaryTree(treeArray);
        System.out.println(new Solution().searchBST(root, 6));
    }
}
