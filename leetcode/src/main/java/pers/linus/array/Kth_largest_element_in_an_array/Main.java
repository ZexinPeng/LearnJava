package pers.linus.array.Kth_largest_element_in_an_array;

public class Main {
    public static void main(String[] args) {
        // 3,2,3,1,2,4,5,5,6
        // 1, 2, 3, 4, 5, 6, 7
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(nums, 7));
    }
}
