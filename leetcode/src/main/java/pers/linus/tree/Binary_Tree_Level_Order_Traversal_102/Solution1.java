package pers.linus.tree.Binary_Tree_Level_Order_Traversal_102;

import pers.linus.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new LinkedList<>();
        recursion(root, resList, 0);
        return resList;
    }

    private void recursion(TreeNode node, List<List<Integer>> resList, int depth) {
        if (node == null) {
            return;
        }
        if (resList.size() <= depth) {
            resList.add(new LinkedList<>());
        }
        List<Integer> levelList = resList.get(depth);
        levelList.add(node.val);
        recursion(node.left, resList, depth + 1);
        recursion(node.right, resList, depth + 1);
    }
}
