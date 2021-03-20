package pers.linus.tree.Binary_Tree_Inorder_Traversal_94;

import pers.linus.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new LinkedList<Integer>();
        if (root == null) {
            return resList;
        }
        dfs(root.left, resList);
        resList.add(root.val);
        dfs(root.right, resList);
        return resList;
    }

    private void dfs(TreeNode node, List<Integer> resList) {
        if(node != null) {
            dfs(node.left, resList);
            resList.add(node.val);
            dfs(node.right, resList);
        }
    }
}
