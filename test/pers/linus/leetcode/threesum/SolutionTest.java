package pers.linus.leetcode.threesum;

import org.junit.jupiter.api.Test;
import pers.linus.leetcode.repeatword.Main;

import java.util.LinkedList;
import java.util.List;

class SolutionTest extends Main {

    Solution2 solution = new Solution2();
    List<List<Integer>> ans = new LinkedList<>();
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

    @Test
    public void case1() {
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case2() {
        nums = new int[]{0, 0, 0};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case3() {
        nums = new int[]{0, 1, 1};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case4() {
        nums = new int[]{1, 1, -2};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case5() {
        nums = new int[]{3, 1, -2, 0};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case6() {
        nums = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case7() {
        nums = new int[]{0,-4,-1,-4,-2,-3,2};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case8() {
        nums = new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

    @Test
    public void case9() {
        nums = new int[]{0, 0, 0, 0};
        ans = solution.threeSum(nums);
        System.out.println(ans);
    }

}