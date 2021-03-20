package pers.linus.two_pointers.Trapping_Rain_Water_42;

public class Main {
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new Solution().trap(height));
    }
}
