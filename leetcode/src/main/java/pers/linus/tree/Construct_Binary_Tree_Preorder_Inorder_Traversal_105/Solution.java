package pers.linus.tree.Construct_Binary_Tree_Preorder_Inorder_Traversal_105;

import pers.linus.TreeNode;

public class Solution {

    public static void main(String[] args) {
        new Solution().buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }

    private int preStart = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recursion(preorder, inorder, 0, preorder.length - 1);
    }

    private TreeNode recursion(int[] preorder, int[] inorder, int left, int right) {
        if (preStart == preorder.length || left > right ) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        for (int i = left; i <= right; i++) {
            if (preorder[preStart] == inorder[i]) {
                preStart++;
                root.left = recursion(preorder, inorder, left, i - 1);
                root.right = recursion(preorder, inorder, i + 1, right);
                break;
            }
        }
        return root;
    }

}
