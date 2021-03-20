package pers.linus.tree.hasPathSum_112;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        int nullNum = Integer.MIN_VALUE;
        int[] nums = new int[]{1,2,nullNum,3,nullNum,4,nullNum,5};
        System.out.println(new Solution().hasPathSum(TreeNode.convertArray2BinaryTree(nums), -1));
    }
}
