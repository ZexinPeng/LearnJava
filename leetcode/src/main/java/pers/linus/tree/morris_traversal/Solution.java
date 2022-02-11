package pers.linus.tree.morris_traversal;

import pers.linus.TreeNode;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        new Solution().inorder(root);
    }

    public void inorder(TreeNode root) {
        TreeNode cur = root, prev;
        while (cur != null) {
            if (cur.left == null) {
                System.out.println(cur.val);
                cur = cur.right;
            } else {
                prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    prev.right = null;
                    System.out.println(cur.val);
                    cur = cur.right;
                }
            }
        }
//        TreeNode cur = root, prev;
//        while (cur != null)
//        {
//            if (cur.left == null)          // 1.
//            {
//                System.out.println(cur.val);
//                cur = cur.right;
//            }
//            else
//            {
//                // find predecessor
//                prev = cur.left;
//                while (prev.right != null && prev.right != cur)
//                    prev = prev.right;
//
//                if (prev.right == null)   // 2.a)
//                {
//                    prev.right = cur;
//                    cur = cur.left;
//                }
//                else                       // 2.b)
//                {
//                    prev.right = null;
//                    System.out.println(cur.val);
//                    cur = cur.right;
//                }
//            }
//        }
    }
}
