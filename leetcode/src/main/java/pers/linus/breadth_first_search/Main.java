package pers.linus.breadth_first_search;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode root = solution.new TreeNode(3);
        root.left = solution.new TreeNode(9);
        root.right = solution.new TreeNode(20);
        root.right.left = solution.new TreeNode(15);
        root.right.right = solution.new TreeNode(7);
        solution.levelOrder(root);
    }
}
