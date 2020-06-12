package pers.linus.dfs.construct_binary_tree_from_preorder_and_inorder_traversal_105;

import java.util.LinkedList;

public class Solution {
    int lastIndex = 1;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length < 1) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                dfs(node, preorder, inorder, 0, i - 1, true);
                dfs(node, preorder, inorder, i + 1, preorder.length - 1, false);
                break;
            }
        }
        return node;
    }

    private void dfs (TreeNode node, int[] preorder, int[] inorder, int first, int last, boolean isLeft) {
        if (first <= last) {
            int rootIndex = lastIndex;
            for (int i = first; i <= last; i++) {
                if (preorder[lastIndex] == inorder[i]) {
                    lastIndex++;
                    rootIndex = i;
                    break;
                }
            }
            if (isLeft) {
                node.left = new TreeNode(inorder[rootIndex]);
                node = node.left;
            }
            else {
                node.right = new TreeNode(inorder[rootIndex]);
                node = node.right;
            }
            dfs(node, preorder, inorder, first, rootIndex - 1, true);
            dfs(node, preorder, inorder, rootIndex + 1, last, false);
        }
    }

    private int findRoot(int[] preorder, int[] inorder, int first, int last) {
        for (int i = first; i <= last; i++) {
            if (preorder[lastIndex] == inorder[i]) {
                lastIndex = lastIndex + last - first + 1;
                return i;
            }
        }
        return first;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
