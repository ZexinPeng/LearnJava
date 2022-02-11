package pers.linus.tree.Populating_Next_Right_Pointers_Each_Node_116;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        new Solution().connect(root);
        new StringBuilder();
        new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println();
    }
    private Node oneStepLeftToRight(Node node) {
        node = node.left;
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }
    private Node oneStepRightToLeft(Node node) {
        node = node.right;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    // recursion
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        return root;
    }

    private void dfs(Node node) {
        if (node.left == null || node.right == null) {
            return;
        }
        node.left.next = node.right;
        Node leftNode = oneStepLeftToRight(node);
        Node rightNode = oneStepRightToLeft(node);
        leftNode.next = rightNode;
        dfs(node.left);
        dfs(node.right);
    }
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
