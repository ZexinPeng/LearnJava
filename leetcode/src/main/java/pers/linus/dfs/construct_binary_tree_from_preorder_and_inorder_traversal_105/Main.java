package pers.linus.dfs.construct_binary_tree_from_preorder_and_inorder_traversal_105;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
//        int[] preorder = new int[]{1,2,4,5,3,6,8,7};
//        int[] inorder = new int[]{4,2,5,1,8,6,3,7};
        solution.buildTree(preorder, inorder);
    }
}
