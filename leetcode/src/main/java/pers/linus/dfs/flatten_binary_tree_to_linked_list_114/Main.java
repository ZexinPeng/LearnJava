package pers.linus.dfs.flatten_binary_tree_to_linked_list_114;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode treeNode = solution.new TreeNode(1);
//        treeNode.left = solution.new TreeNode(2);
//        treeNode.right = solution.new TreeNode(5);
//        treeNode.left.left = solution.new TreeNode(3);
//        treeNode.left.right = solution.new TreeNode(4);
//        treeNode.right.right = solution.new TreeNode(6);
//        treeNode.right = solution.new TreeNode(2);
//        treeNode.right.left = solution.new TreeNode(3);
        treeNode.left = solution.new TreeNode(2);
        solution.flatten(treeNode);
        System.out.println(treeNode.val);
        System.out.println(treeNode.right.val);
        System.out.println(treeNode.right.right.val);
        System.out.println(treeNode.right.right.right.val);
        System.out.println(treeNode.right.right.right.right.val);
        System.out.println(treeNode.right.right.right.right.right.val);
    }
}
