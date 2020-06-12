package pers.linus.breadth_first_search;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    LinkedList<TreeNode> nodeList = new LinkedList<TreeNode>();
    LinkedList<Integer> layerList = new LinkedList<Integer>();
    LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root, 0);
        return result;
    }

    private void bfs(TreeNode node, int layer) {
        if (node != null) {
            if (result.size() <= layer) {
                result.add(layer, new LinkedList<Integer>());
            }
            List<Integer> list = result.get(layer);
            list.add(node.val);
            if (node.left != null) {
                nodeList.add(node.left);
                layerList.add(layer + 1);
            }
            if (node.right != null) {
                nodeList.add(node.right);
                layerList.add(layer + 1);
            }
            while(nodeList.size() != 0) {
                bfs(nodeList.remove(), layerList.remove());
            }
        }
    }
}
