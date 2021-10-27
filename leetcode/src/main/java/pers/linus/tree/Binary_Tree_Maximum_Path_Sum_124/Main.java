package pers.linus.tree.Binary_Tree_Maximum_Path_Sum_124;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        int nullNum = Integer.MIN_VALUE;
        TreeNode root = TreeNode.convertArray2BinaryTree(new int[]{5,4,8,11,nullNum,13,4,7,2,nullNum,nullNum,nullNum,1});
        System.out.println(new Solution().maxPathSum(root));
    }
}
