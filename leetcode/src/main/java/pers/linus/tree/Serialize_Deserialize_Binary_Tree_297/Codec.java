package pers.linus.tree.Serialize_Deserialize_Binary_Tree_297;

import pers.linus.CommonTool;
import pers.linus.TreeNode;
import pers.linus.tree.Path_Sum_III_437.Solution;

import java.util.*;

public class Codec {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
//        System.out.println(new Solution().pathSum(root, 3));
        LinkedList<TreeNode> list = new LinkedList<>();
        new Codec().deserialize(new Codec().serialize(root));
        System.out.println();
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (list.size() > 0) {
            TreeNode node = list.poll();
            if (node != null) {
                list.add(node.left);
                list.add(node.right);
                sb.append(node.val);
            } else {
                sb.append('X');
            }
            sb.append(',');
        }
        System.out.println(sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));
        return buildTree(list);
    }

    private TreeNode buildTree(LinkedList<String> list) {
        String val = list.poll();
        if (val.equals("X")) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(list);
            node.right = buildTree(list);
            return node;
        }
    }
}
