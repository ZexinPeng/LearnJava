package pers.linus;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
}
    public static TreeNode convertArray2BinaryTree(int[] arr) {
        if (arr.length < 1 || arr[0] == Integer.MIN_VALUE) {
            return null;
        }
        TreeNode root = new TreeNode();
        insert(root, arr, 0);
        return root;
    }

    private static void insert(TreeNode node, int[] arr, int fatherIndex) {
        if (arr[fatherIndex] == Integer.MIN_VALUE) {
            return;
        }
        node.val = arr[fatherIndex];
        int leftSon = fatherIndex * 2 + 1;
        if (leftSon < arr.length) {
            node.left = new TreeNode();
            insert(node.left, arr, leftSon);
        }
        int rightSon = (fatherIndex + 1) * 2;
        if (rightSon < arr.length) {
            node.right = new TreeNode();
            insert(node.right, arr, rightSon);
        }
    }
}
