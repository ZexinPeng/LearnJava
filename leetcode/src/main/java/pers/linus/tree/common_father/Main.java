package pers.linus.tree.common_father;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode root = solution.new TreeNode(3);
        root.left = solution.new TreeNode(5);
        root.right = solution.new TreeNode(1);
        root.left.left = solution.new TreeNode(6);
        root.left.right = solution.new TreeNode(21);
        root.left.right.left = solution.new TreeNode(7);
        root.left.right.right = solution.new TreeNode(4);
        root.right.left = solution.new TreeNode(0);
        root.right.right = solution.new TreeNode(8);
        Solution.TreeNode result = solution.lowestCommonAncestor(root, root.left, root.left.right.right);
        System.out.println(result.val);
    }
}
