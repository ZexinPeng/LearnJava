package pers.linus.dynamic_programming.product_of_array_except_self_238;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] result = new OptimizeSolution().productExceptSelf(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
