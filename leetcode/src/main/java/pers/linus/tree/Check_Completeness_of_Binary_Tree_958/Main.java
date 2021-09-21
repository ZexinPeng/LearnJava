package pers.linus.tree.Check_Completeness_of_Binary_Tree_958;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isCompleteTree(TreeNode.convertArray2BinaryTree(new int[] {1, 2, 3, 4, 5, 6})));
    }
}
