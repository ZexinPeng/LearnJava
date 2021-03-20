package pers.linus.tree.Binary_Tree_Level_Order_Traversal_102;

import pers.linus.ListNode;
import pers.linus.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new LinkedList<>();
        if (root == null) {
            return resList;
        }
        List<TreeNode> levelList = new LinkedList<>();
        Map<TreeNode, Integer> levelMap = new HashMap<>();
        levelMap.put(root, 0);
        levelList.add(root);
        bfs(resList, levelList, levelMap);
        return resList;
    }

    private void bfs(List<List<Integer>> resList, List<TreeNode> levelList, Map<TreeNode, Integer> levelMap) {
        if (levelList.size() == 0) {
            return;
        }
        TreeNode node = levelList.get(0);
        int depth = levelMap.get(node);
        levelMap.remove(node);
        levelList.remove(0);
        if (node.left != null) {
            levelList.add(node.left);
            levelMap.put(node.left, depth + 1);
        }
        if (node.right != null) {
            levelList.add(node.right);
            levelMap.put(node.right, depth + 1);
        }
        if (resList.size() == depth) {
            resList.add(new LinkedList<>());
        }
        List<Integer> tmpList = resList.get(depth);
        tmpList.add(node.val);
        bfs(resList, levelList, levelMap);
    }
}
