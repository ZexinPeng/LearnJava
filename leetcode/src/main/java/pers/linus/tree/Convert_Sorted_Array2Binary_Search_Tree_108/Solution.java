package pers.linus.tree.Convert_Sorted_Array2Binary_Search_Tree_108;

import pers.linus.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        root.val = nums[nums.length / 2];
        constructNode(root, nums, 0, nums.length / 2 - 1);
        constructNode(root, nums, nums.length / 2 + 1, nums.length - 1);
        return root;
    }

    private void constructNode(TreeNode node, int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        if (node.val > nums[end]) {
            node.left = new TreeNode(nums[(start + end) / 2]);
            constructNode(node.left, nums, start, (start + end) / 2 - 1);
            constructNode(node.left, nums, (start + end) / 2 + 1, end);
        }
        else {
            node.right = new TreeNode(nums[(start + end) / 2]);
            constructNode(node.right, nums, start, (start + end) / 2 - 1);
            constructNode(node.right, nums, (start + end) / 2 + 1, end);
        }
    }
}
