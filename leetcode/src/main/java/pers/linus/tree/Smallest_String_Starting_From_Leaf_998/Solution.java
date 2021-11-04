package pers.linus.tree.Smallest_String_Starting_From_Leaf_998;

import javafx.util.Pair;
import pers.linus.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        int[] treeArray = new int[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        TreeNode root = TreeNode.convertArray2BinaryTree(treeArray);
        System.out.println(new Solution().smallestFromLeaf(root));
        LinkedList<Integer> list = new LinkedList<>();
    }
    String res = null;

    public String smallestFromLeaf(TreeNode root) {
        preorder(root, new LinkedList<Character>());
        return res;
    }

    private void preorder(TreeNode node, LinkedList<Character> tmp) {
        if (node == null) {
            return;
        }
        tmp.add((char)node.val);
        if (node.left == null && node.right == null) {
            res = getSmaller(getFromList(tmp), res);
            tmp.removeLast();
            return;
        }
        preorder(node.left, tmp);
        preorder(node.right, tmp);
    }

    private String getSmaller(String a, String res) {
        if (res == null) {
            return a;
        }
        int i = 0;
        while (i < a.length() && i < res.length()) {
            if (a.charAt(i) > res.charAt(i)) {
                return res;
            } else if (a.charAt(i) < res.charAt(i)) {
                return a;
            }
        }
        return i == a.length() ? a : res;
    }

    private String getFromList(LinkedList<Character> tmp) {
        StringBuilder sb = new StringBuilder();
        for (Character ch: tmp) {
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
