package pers.linus.tree.mergeTrees_617;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        int nullNum = Integer.MIN_VALUE;
        TreeNode root1 = TreeNode.convertArray2BinaryTree(new int[]{1, 3, 2, 5});
        TreeNode root2 = TreeNode.convertArray2BinaryTree(new int[]{2,1,3,nullNum,4,nullNum,7});
        new Solution().mergeTrees(root1, root2);
    }
}
