package pers.linus.tree.Flatten_Binary_Tree2Linked_List_114;

import pers.linus.TreeNode;

public class Main {
    public static void main(String[] args) {
        int nullNum = Integer.MIN_VALUE;
        // 1, nullNum, 2, nullNum, nullNum, 3
        // 1, 2, 5, 3, 4, nullNum, 6
        new Solution().flatten(TreeNode.convertArray2BinaryTree(new int[]{1, nullNum, 2, nullNum, nullNum, 3}));
    }
}
