package pers.linus.array.third_maximum_number_414;

public class Main {
    public static void main(String[] args) {
        // 2, 2, 3, 1, 88
        // 1, 2, 3, 4, 5, 5, 5, 5, 6, 10
        // 1, 2
        // 1, 1, 2
        // -2147483648, 1, 1
        int[] nums = new int[]{1,2,-2147483648};
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(nums));
    }
}
