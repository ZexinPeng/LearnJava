package pers.linus.dfs.validate_binary_search_tree_98;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode root = solution.new TreeNode(-2147483648);
        root.right = solution.new TreeNode(2147483647);
//        root.left = solution.new TreeNode(4);
//        root.right = solution.new TreeNode(8);
//        root.right.left = solution.new TreeNode(7);
//        root.right.right = solution.new TreeNode(9);
//        root.left = solution.new TreeNode(5);
//        root.right = solution.new TreeNode(15);
//        root.right.left = solution.new TreeNode(6);
//        root.right.right = solution.new TreeNode(20);
//        root.left = solution.new TreeNode(1);
//        root.right = solution.new TreeNode(5);
//        root.left.left = solution.new TreeNode(0);
//        root.left.right = solution.new TreeNode(2);
//        root.left.right.right = solution.new TreeNode(3);
//        root.right.left = solution.new TreeNode(4);
//        root.right.right = solution.new TreeNode(6);
        System.out.println(solution.isValidBST(root));
    }
}
