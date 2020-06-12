package pers.linus.dfs.house_robberIII_337;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode treeNode = solution.new TreeNode(3);
        treeNode.left = solution.new TreeNode(4);
        treeNode.right = solution.new TreeNode(5);
        treeNode.left.left = solution.new TreeNode(1);
        treeNode.left.right = solution.new TreeNode(3);
        treeNode.right.right = solution.new TreeNode(1);
//        treeNode.left = solution.new TreeNode(2);
//        treeNode.right = solution.new TreeNode(3);
//        treeNode.left.right = solution.new TreeNode(3);
//        treeNode.right.right = solution.new TreeNode(1);
        System.out.println(solution.rob(treeNode));
    }
}
