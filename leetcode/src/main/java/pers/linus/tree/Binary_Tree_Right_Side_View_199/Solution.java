package pers.linus.tree.Binary_Tree_Right_Side_View_199;

import pers.linus.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resList = new LinkedList<>();
        dfs(root, resList, 1);
        return resList;
    }

    private void dfs (TreeNode node, List<Integer> resList, int depth) {
        if (node == null) {
            return;
        }
        if (resList.size() < depth) {
            resList.add(node.val);
        }
        dfs(node.right, resList, depth + 1);
        dfs(node.left, resList, depth + 1);
    }
}
