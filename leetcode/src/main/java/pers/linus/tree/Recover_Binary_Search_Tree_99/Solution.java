package pers.linus.tree.Recover_Binary_Search_Tree_99;

import pers.linus.TreeNode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int c = 21474836;

        System.out.println(21474836 >= (Integer.MAX_VALUE - 6) / 10);
        Integer a = new Integer(5);
        Integer b = new Integer(5);
        System.out.println(a == b);
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(8);
        set.add(5);
        new LinkedList<Integer>().toArray();
        System.out.println((-5) % 10);
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        new Solution().recoverTree(root);
        System.out.println(1);
    }
    public void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }

    public int[] findTwoSwapped(List<Integer> nums) {
        int n = nums.size();
        int x = -1, y = -1;
        for(int i = 0; i < n - 1; ++i) {
            if (nums.get(i + 1) < nums.get(i)) {
                y = nums.get(i + 1);
                // first swap occurence
                if (x == -1) x = nums.get(i);
                    // second swap occurence
                else break;
            }
        }
        return new int[]{x, y};
    }

    public void recover(TreeNode r, int count, int x, int y) {
        if (r != null) {
            if (r.val == x || r.val == y) {
                r.val = r.val == x ? y : x;
                if (--count == 0) return;
            }
            recover(r.left, count, x, y);
            recover(r.right, count, x, y);
        }
    }

    public void recoverTree(TreeNode root) {
        List<Integer> nums = new ArrayList();
        inorder(root, nums);
        int[] swapped = findTwoSwapped(nums);
        recover(root, 2, swapped[0], swapped[1]);
    }
}
