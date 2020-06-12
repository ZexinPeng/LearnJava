package pers.linus.dfs.validate_binary_search_tree_98;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root) {
        int[] arr = new int[2];
        return isValid(root, arr);
    }

    private boolean isValid(TreeNode node, int[] parentArr) {
        if (node != null) {
            // arr[0]保存左子树的最大值, arr[1]保存右子树的最小值。
            // 对于树的每个节点，保证左子树的最大值小于节点的值，右子树的最小值大于节点的值
            int[] arrLeft = new int[2];
            int[] arrRight = new int[2];
            boolean isLeftValid = true;
            boolean isRightValid = true;
            if (node.left != null) {
                isLeftValid = isValid(node.left, arrLeft);
                if (arrLeft[0] >= node.val) {
                    return false;
                }
            }
            if (node.right != null) {
                isRightValid = isValid(node.right, arrRight);
                if (arrRight[1] <= node.val) {
                    return false;
                }
            }
            if (node.left == null && node.right == null) {
                parentArr[0] = node.val;
                parentArr[1] = node.val;
            }
            else if (node.left == null) {
                parentArr[0] = Math.max(node.val, arrRight[0]);
                parentArr[1] = Math.min(node.val, arrRight[1]);
            }
            else if (node.right == null){
                parentArr[0] = Math.max(node.val, arrLeft[0]);
                parentArr[1] = Math.min(node.val, arrLeft[1]);
            }
            else {
                parentArr[0] = Math.max(Math.max(node.val, arrRight[0]), arrLeft[0]);
                parentArr[1] = Math.min(Math.min(node.val, arrLeft[1]), arrRight[1]);
            }
            return isLeftValid && isRightValid;
        }
        return true;
    }
}
