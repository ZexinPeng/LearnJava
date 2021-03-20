package pers.linus.tree.Binary_Tree_Zigzag_Level_Order_Traversal_103;

import pers.linus.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> resList = new LinkedList<>();
        dfs(root, resList, 0);
        return resList;
    }

    private void dfs(TreeNode node, List<List<Integer>> resList, int depth) {
        if (node == null) {
            return;
        }

        if (resList.size() <= depth) {
            List<Integer> newList = new LinkedList<>();
            resList.add(newList);
        }
        List<Integer> tmpList = resList.get(depth);
        if (depth % 2 == 0) {
            tmpList.add(node.val);
        }
        else {
            tmpList.add(0, node.val);
        }
        dfs(node.left, resList, depth + 1);
        dfs(node.right, resList, depth + 1);
    }
}
