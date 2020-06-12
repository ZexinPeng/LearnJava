package pers.linus.dfs.house_robberIII_337;

public class Solution {
    int maxValue = 0;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] dp = dfs(root);
        return Math.max(dp[0], dp[1]);
    }

    private int[] dfs(TreeNode node) {
        //dp[0]表示当前节点不偷所能获得的最大收益, dp[1]表示当前节点选择偷所能获得的最大收益
        //选择不偷当前节点时，可以选择偷或者不偷左或右子孩子中的最大值，选择偷当前节点，必不可能偷左右子孩子节点
        int[] dp = new int[2];
        if (node != null) {
            int[] leftDp = dfs(node.left);
            int[] rightDp = dfs(node.right);
            dp[0] = Math.max(leftDp[0], leftDp[1]) + Math.max(rightDp[0], rightDp[1]);
            dp[1] = leftDp[0] + rightDp[0] + node.val;
        }
        return dp;
    }
}
